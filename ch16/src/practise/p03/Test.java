package practise.p03;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "俞思笳1", "yusijia1", 25, "大一"));
        list.add(new Student(2, "俞思笳2", "yusijia2", 22, "大二"));
        list.add(new Student(3, "俞思笳3", "yusijia3", 23, "大三"));
        list.add(new Student(4, "俞思笳4", "yusijia4", 24, "大四"));
        File file = new File("src/1.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        output.writeObject(list.get(0));
        output.writeObject(list.get(1));
        output.writeObject(list.get(2));
        output.writeObject(list.get(3));
        output.flush();
        System.out.println("请输入编号，姓名");
        Scanner sca = new Scanner(System.in);
        int account = sca.nextInt();
        String password = sca.next();
        boolean flag = true;
        for (Student stu : list) {
            if (stu.getNumber() == account && password.equals(stu.getPassword())) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("请注册账号：");
            Student stu = new Student();
            list.add(stu);
            System.out.println("请输入学生编号：");
            stu.setNumber(sca.nextInt());
            System.out.println("请输入姓名：");
            stu.setName(sca.next());
            System.out.println("请输入年龄：");
            stu.setAge(sca.nextInt());
            System.out.println("请输入密码：");
            stu.setPassword(sca.next());
            System.out.println("请输入年级：");
            stu.setGrade(sca.next());
            System.out.println("注册成功");
            output.writeObject(list.get(list.size() - 1));
            output.flush();
        }
        System.out.println("登录成功");
        System.out.println("请输入需要查找的学生姓名：");
        String stu2 = sca.next();
        for (Student stu : list) {
            if (stu2.equals(stu.getName())) {
                System.out.println(stu.toString());
            }
        }
        Collections.sort(list);
        for (Student stu : list) {
            output.writeObject(stu);
        }
        output.close();
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
            Student stu = (Student) input.readObject();
            while (stu != null) {
                System.out.println(stu);
                stu = (Student) input.readObject();
            }
            input.close();
        } catch (EOFException | ClassNotFoundException e) {

        }
    }
}
