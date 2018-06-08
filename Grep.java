//Grep - поиск строки во всех файлах папки
//Входные агрументы (имя файла со списком имен файлов и папок для поиска, имя выходного файла с результатами, строка для поиска)

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class Grep {
    private String path;
    private String search;
    private PrintStream out;

    Grep(String path, String output, String search) {
        this.path = path;
        this.search = search;
        File file = new File(output);
        try {
            this.out = new PrintStream(new File(output));
        } catch (FileNotFoundException e) {
            System.out.println("Выходного файла не существует");
        }
        prepareFiles(path);
    }

    private void prepareFiles(String path) {
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> files = new ArrayList<>();
            while (reader.ready())
                files.add(reader.readLine());
            find(files, 0);
        } catch (Exception e) {
            System.out.println("Входного файла не существует");
        }
    }


    private void find(ArrayList<String> files, int c) {
        for (String file1 : files) {
            File file = new File(file1);
            if (!file.exists()) {
                System.out.println("Файла " + file.getAbsolutePath() + " не существует");
                break;
            }
            if (!file.isDirectory()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    int count = 0;
                    while (reader.ready()) {
                        String s = reader.readLine();
                        count++;
                        if (s.contains(search)) {
                            out.println("line #" + count + " " + file.getAbsolutePath());
                            if (s.indexOf(search, s.indexOf(search) + search.length()) != -1) {
                                out.println("line #" + count + " " + file.getAbsolutePath());
                            }
                        }
                    }

                } catch (IOException e) {
                    //e.printStackTrace();
                }
            } else {
                String[] tmp = file.list();
                ArrayList<String> tmp2 = new ArrayList<>();
                for (int i = 0; i < tmp.length; i++) {
                    tmp2.add(new File(file.getName() + "\\" + tmp[i]).getAbsolutePath());
                }
                find(tmp2, c + 1);
            }
        }
        if (c == 0)
            out.close();
    }
}

class Test {
    public static void main(String[] args) {
        try {
            new Grep(args[0], args[1], args[2]);
        } catch (Exception e) {
            System.out.println("Ошибка работы программы");
        }
    }
}
