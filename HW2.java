//Простой калькулятор, который может высчитывать значение переданного им выражения используя Польскую обратную запись.
//Ввод - выражение до знака "="
import java.util.*;


public class HW2 {

    static class Expression {
        private int value;
        private String s;

        void setS(String s) {
            this.s = s;
        }

        Expression(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        String evaluate(int number) {
            s = s.replaceAll("x", String.valueOf(number)).replaceAll("--", "");
            if (s.endsWith("+") || s.endsWith("-") || s.endsWith("*") || s.endsWith("/"))
                return "Некорректная запись: операторов больше чем чисел или столько же";
            String exp;
            try {
                exp = parsing(s);
            } catch (Exception e) {
                return e.getMessage();
            }
            StringTokenizer expression = new StringTokenizer(exp, " ");
            Stack<Expression> expressionStack = new Stack<>();
            while (expression.hasMoreTokens()) {
                String token = expression.nextToken();
                if (!OPERATIONS.keySet().contains(token))
                    expressionStack.push(new Expression(Integer.parseInt(token)));
                else {
                    Expression operand2 = expressionStack.pop();
                    Expression operand1 = expressionStack.empty() ? new Expression(0) : expressionStack.pop();
                    switch (token) {
                        case "*":
                            if (Math.abs((long) operand1.getValue() * (long) operand2.getValue()) > Integer.MAX_VALUE + 1L)
                                return "overflow";
                            expressionStack.push(new Multiply(operand1.getValue(), operand2.getValue()).calculate());
                            break;
                        case "/":
                            try {
                                expressionStack.push(new Divide(operand1.getValue(), operand2.getValue()).calculate());
                            } catch (Exception e) {
                                return "Некорректная запись: обнаружено деление на 0";
                            }
                            break;
                        case "+":
                            if (Math.abs((long) operand1.getValue() + (long) operand2.getValue()) > Integer.MAX_VALUE + 1L)
                                return "overflow";
                            expressionStack.push(new Plus(operand1.getValue(), operand2.getValue()).calculate());
                            break;
                        case "-":
                            expressionStack.push(new Minus(operand1.getValue(), operand2.getValue()).calculate());
                            break;
                        case "^":
                            if (Math.pow(operand1.getValue(), operand2.getValue()) > Integer.MAX_VALUE + 1L)
                                return "overflow";
                            expressionStack.push(new Power(operand1.getValue(), operand2.getValue()).calculate());
                            break;
                    }
                }
            }
            if (expressionStack.size() != 1)
                return "Некорректная запись: ошибка в вычислении";
            return String.valueOf(expressionStack.pop().getValue());


        }
    }

    static class Plus extends Expression {
        private int e1;
        private int e2;

        Plus(int e1, int e2) {
            super(e1 + e2);
            this.e1 = e1;
            this.e2 = e2;
        }

        Expression calculate() {
            return new Expression(e1 + e2);
        }

    }

    static class Minus extends Expression {
        private int e1;
        private int e2;

        Minus(int e1, int e2) {
            super(e1 - e2);
            this.e1 = e1;
            this.e2 = e2;
        }

        Expression calculate() {
            return new Expression(e1 - e2);
        }

    }

    static class Multiply extends Expression {
        private int e1;
        private int e2;

        Multiply(int e1, int e2) {
            super(e1 * e2);
            this.e1 = e1;
            this.e2 = e2;
        }

        Expression calculate() {
            return new Expression(e1 * e2);
        }

    }

    static class Divide extends Expression {
        private int e1;
        private int e2;

        Divide(int e1, int e2) {
            super(e1 / e2);
            this.e1 = e1;
            this.e2 = e2;
        }

        Expression calculate() {
            return new Expression(e1 / e2);
        }

    }

    static class Power extends Expression {
        private int e1;
        private int e2;

        Power(int e1, int e2) {
            super((int) Math.pow(e1, e2));
            this.e1 = e1;
            this.e2 = e2;
        }

        Expression calculate() {
            return new Expression((int) Math.pow(e1, e2));
        }
    }

    private static final Map<String, Integer> OPERATIONS;

    static {
        OPERATIONS = new HashMap<>();
        OPERATIONS.put("+", 3);
        OPERATIONS.put("-", 3);
        OPERATIONS.put("*", 2);
        OPERATIONS.put("/", 2);
        OPERATIONS.put("^", 1);
    }


    private static String parsing(String expression) throws Exception {
        int bracketsCount = 0;
        String thisOperation = null, lastOperation;
        if (expression == null || expression.length() == 0)
            throw new Exception("Некорректная запись");
        if (OPERATIONS == null || OPERATIONS.isEmpty())
            throw new Exception("Некорректная запись");
        ArrayList<String> parsedResult = new ArrayList<>();
        Stack<String> operationsStack = new Stack<>();
        expression = expression.replace(" ", "");
        ArrayList<String> operations = new ArrayList<>(OPERATIONS.keySet());
        operations.add("(");
        operations.add(")");
        for (char c : expression.toCharArray()) {
            lastOperation = thisOperation;
            thisOperation = String.valueOf(c);
            if (lastOperation != null && OPERATIONS.containsKey(thisOperation) && OPERATIONS.containsKey(lastOperation))
                throw new Exception("Некорректная запись: подряд идущие операторы");
        }
        int index = 0;
        while (true) {
            int nextOperationIndex = expression.length();
            String nextOperation = "";
            for (String operation : operations) {
                int i = expression.indexOf(operation, index);
                if (i >= 0 && i < nextOperationIndex) {
                    nextOperation = operation;
                    nextOperationIndex = i;
                }
            }
            if (nextOperationIndex == expression.length())
                break;
            else {
                if (index != nextOperationIndex)
                    parsedResult.add(expression.substring(index, nextOperationIndex));
                switch (nextOperation) {
                    case "(":
                        operationsStack.push(nextOperation);
                        bracketsCount++;
                        break;
                    case ")":
                        while (!operationsStack.peek().equals("(")) {
                            parsedResult.add(operationsStack.pop());
                            if (operationsStack.empty()) {
                                throw new Exception("Некорректная запись: не хватает открывающей скобки");
                            }
                        }
                        bracketsCount--;
                        operationsStack.pop();
                        break;
                    default:
                        while (!operationsStack.empty() && !operationsStack.peek().equals("(") &&
                                (OPERATIONS.get(nextOperation) >= OPERATIONS.get(operationsStack.peek())))
                            parsedResult.add(operationsStack.pop());
                        operationsStack.push(nextOperation);
                        break;
                }
                index = nextOperationIndex + nextOperation.length();
            }
        }
        if (index != expression.length())
            parsedResult.add(expression.substring(index));

        while (!operationsStack.empty())
            parsedResult.add(operationsStack.pop());

        StringBuilder result = new StringBuilder();
        if (!parsedResult.isEmpty())
            result.append(parsedResult.remove(0));
        while (!parsedResult.isEmpty())
            result.append(" ").append(parsedResult.remove(0));
        if (bracketsCount == 0)
            return result.toString();
        else
            throw new Exception("Некорректная запись: не хватает закрывающей скобки");
    }


    private static Expression parse(String input) {
        Expression exp = new Expression(0);
        exp.setS(input);
        return exp;
    }


    public static void main(String[] args) {
        Expression test1 = parse("5 ** (x)");
        System.out.println(test1.evaluate(5)); // Output: "Некорректная запись"

        Expression test2 = parse("-3 * x + 4");
        System.out.println(test2.evaluate(5)); // Output: -11

        Expression test3 = parse("5 *      ( x - 2 ) +      3");
        System.out.println(test3.evaluate(5)); // Output: 18
        Expression test4 = parse("5 *       x - 2 ) +      3");
        Expression test8 = parse("9^2/81+2");
        System.out.println(test8.evaluate(6)); // Output: 18
        System.out.println(test4.evaluate(5)); // Output: 18
        Expression test5 = parse("5 /0");
        System.out.println(test5.evaluate(5)); // Output: 18
        Expression test6 = parse("5 +");
        System.out.println(test6.evaluate(6)); // Output: 18
        Expression test7 = parse("9999999*9999999*999999");
        System.out.println(test7.evaluate(6)); // Output: 18
        Expression test9 = parse("99999^999");
        System.out.println(test9.evaluate(6)); // Output: 18
        Expression test10 = parse("9^2/(81+2");
        System.out.println(test10.evaluate(6)); // Output: 18
    }
}