package example.e02;

import java.io.*;

public class E02 {
    public static void main(String[] args) {
        File file = new File("src/example/1.txt");
        String str = "你好";
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream outPut = null;
        InputStream input = null;
        try {
            outPut = new FileOutputStream(file);
            input = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            outPut.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte [] by=new byte[(int)file.length()];
        String str2=new String(by);
        System.out.println(str2);
        try {
            System.out.println(input.read(by));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outPut.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
