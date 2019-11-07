package practise.s01;

import java.util.Scanner;

/**
 * @author 俞思笳
 * @date 20191027
 */
public class TestStudent {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int account;
        String password;
        Student[] stu = new Student[6];
        Question ques = new Question();
        Scanner sca = new Scanner(System.in);
//        for (int i = 0; i < 6; i++) {
//            stu[i] = new Student();
//        }
        stu[0] = new Student(000, "俞思笳", 0);
        System.out.println("请输入账号密码：");
        account = sca.nextInt();
        password = sca.next();
        while (stu[0].getStuNum() != account || stu[0].getName().equals(password) == false) {
            System.out.println("账号密码错误，请重新输入：");
            account = sca.nextInt();
            password = sca.next();
        }
        System.out.println("登录成功");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            a = (int) (30 * Math.random() + 1);
            arr[i] = a;
            for (int j = 0; j < i ; j++) {
                if (a == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            ques.question(arr[i], i + 1);
            System.out.println("请输入答案：");
            sum = ques.answer(sca.next(), sum);
        }
        stu[0].setStuScore(sum);
        System.out.println(stu[0].toString());
    }
}
