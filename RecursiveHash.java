//RecursiveHash - вычисление FNV файлов
//Входные агрументы (имя файла со списком имен файлов и папок для вычисления FNV, имя выходного файла с результатами)

import java.io.*; // импорт
import java.util.ArrayList; // импорт

public class RecursiveHash { // главный класс
    private PrintStream out; // поток вывода в файл вывода

    public RecursiveHash(String in, String out) { // стартовая функция (главная)
        try { // проверка на наличие входного файла
            this.out = new PrintStream(new File(out));// попытка создать поток ввода
        } catch (FileNotFoundException e) { // ой, исключение
            System.out.println("Выходного файла не существует"); // выводим сообщение об ошибке
            System.exit(0); // завершаем программу подобру-поздорову
        }
        prepareFiles(in); // если мы ещё живы, то запускаем подготовку файлов
    }

    private void prepareFiles(String in) {
        File file = new File(in); //создаем входной файл
        try { // проверка на наличие ошибок
            BufferedReader reader = new BufferedReader(new FileReader(file)); // создаем читателя
            ArrayList<String> files = new ArrayList<>(); // создаем лист с именами файлов
            while (reader.ready()) //читаем до конца
                files.add(reader.readLine()); // добавляем в лист найденный файл
            find(files, 0); // обработка хешей в найденных файлах
        } catch (Exception e) { // ой, исключение
            System.out.println("Входного файла не существует"); // выводим сообщение об ошибке
        }
    } // поиск и подготовка файлов

    private void find(ArrayList<String> files, int c) { // функция поиска хешей
        int hex = 0; // хеш
        for (String file1 : files) { // пробегаемся по всем файлам
            File file = new File(file1); // создаем файл по полученной строке
            if (!file.exists()) { // если файл существует
                System.out.println("Файла " + file.getAbsolutePath() + " не существует"); // выводим на консоль ошибку
                out.println("00000000" + " " + file.getAbsolutePath()); // выводим нули в файл
                break;
            }
            if (!file.isDirectory()) { // если папка не является директорией
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) { //запускаем ридер
                    while (reader.ready()) { // читаем до конца
                        String s = reader.readLine();// берем строку
                        hex += hash32(s); // получаем её хеш и суммируем с общим
                    }
                    out.println(Integer.toHexString(hex) + " " + file.getAbsolutePath()); // выводим хеш вместе с путем к файлу

                } catch (IOException e) { // ой, исключение
                    out.println("00000000" + " " + file.getAbsolutePath()); // если возникла ошибка в чтении файла - выводим нули в файл
                }
            } else { // это всё-таки директория
                String[] tmp = file.list(); // берем все файлы в папке
                ArrayList<String> tmp2 = new ArrayList<>(); // создаем лист их названий
                for (int i = 0; i < tmp.length; i++) { // пробегаемся по листу
                    tmp2.add(new File(file.getName() + "\\" + tmp[i]).getAbsolutePath()); // из названия делаем путь к файлу
                }
                find(tmp2, c + 1); // запуск поиска файлов в папке
            }
        }
        if (c == 0) // проверка на оставшиеся файлы
            out.close(); // закрытие потока вывода после записи всех хешей
    }

    private static final int FNV_32_INIT = 0x811c9dc5; // константа
    private static final int FNV_32_PRIME = 0x01000193; // константа

    public static int hash32(final String k) { // собственной хеш-функция
        int rv = FNV_32_INIT; // забираем константу, чтобы с ней работать
        final int len = k.length(); // берем длинну строки
        for (int i = 0; i < len; i++) { // пробегаемся по всем символам
            rv ^= k.charAt(i); // берем символ и складываем по модулю 2
            rv *= FNV_32_PRIME; // умножение на простое число
        }
        return rv; // возвращаем наш ☭ хеш
    } // hash-функция https://ru.wikipedia.org/wiki/FNV

}

class Test2 { // тестовый класс
    public static void main(String[] args) { // основная функция

        try {// проверка на наличие критических ошибок программы
            new RecursiveHash(args[0], args[1]); // запускаем программу

        } catch (Exception e) {// такое бывает???
            System.out.println("Ошибка работы программы");// выводим сообщение об ошибке
        }
    }// ...
} // ВСЁ!
