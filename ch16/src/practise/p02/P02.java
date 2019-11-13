package practise.p02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P02 {
    public static void main(String[] args) throws IOException {
//        InputStream is = null;
//        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        File outputFile = new File("src/outputFile.txt");
//        File outputFile1 = new File("src/outputFile1.txt");
        File file = new File("src");
        File file1 = new File("src/1.txt");
        File file2 = new File("src/2.txt");
        File file3 = new File("src/3.doc");
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
//        if (!outputFile1.exists()) {
//            outputFile1.createNewFile();
//        }
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }
        File[] files = P02.myList(file);
//        file.listFiles()
//        File[] files = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                if (dir.exists()) {
//                    return name.endsWith(".txt") || name.endsWith(".doc");
//                }
//                return false;
//            }
//        });
        for (
                int i = 0;
                i < files.length; i++) {
            Reader read = new FileReader(files[i]);
            char[] arr = new char[(int) files[i].length() / 3];
            read.read(arr);
            Writer writer = new FileWriter(outputFile, true);
//            OutputStreamWriter writer1 = new OutputStreamWriter(new FileOutputStream(outputFile1, true), "utf-8");
//            writer1.write(arr);
//            writer1.write("\n");
            writer.write(arr);
            writer.write("\n");
            System.out.println(arr);
            read.close();
            writer.close();
//            writer1.close();
        }
    }

    public static File[] myList(File file) {
        File[] files = file.listFiles();
        List<File> list = new ArrayList<>();
        for (File fileFirst : files) {
            if (fileFirst.isDirectory()) {
                myList(fileFirst);
            } else {
                if (fileFirst.getName().endsWith(".txt") || fileFirst.getName().endsWith(".doc")) {
                    list.add(fileFirst);
                }
            }
        }
        return list.toArray(new File[list.size()]);
    }
}
