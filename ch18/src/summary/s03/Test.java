package summary.s03;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("src/summary/player.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println("请输入球员：");
        Scanner sca=new Scanner(System.in);
        String name=sca.next();
        byte [] arr=new byte[200];
        InputStream input=new BufferedInputStream(new FileInputStream(file));
        int length=input.read(arr);
        input.close();
        String str=new String(arr,0,length);
        String regex="[，\n]";
        String [] str1=str.split(regex);
        for (int i = 0; i <str1.length ; i++) {
            if(str1[i].equals(name)){
                System.out.println(str1[i+1]);
                break;
            }
            if(i==str1.length-1){
                System.out.println("不存在该球员");
            }
        }

//        ObjectInputStream input=new ObjectInputStream(new FileInputStream(file));
//        qiudui obj=(qiudui)input.readObject();
//        System.out.println(obj);


    }
}
