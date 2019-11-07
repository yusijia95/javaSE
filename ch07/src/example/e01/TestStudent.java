package example.e01;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("俞思笳", 20, "紫东国际", "123456789");
        Student stu2 = new Student("俞思笳", 20, "紫东国际", "123456789");
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1==stu2);
        Student stu3 = new Student();
        Student stu4 = new Student();
        System.out.println(stu3.equals(stu4));
        int [] arr=new int[3];
        int a=arr.length;
        String s="sfa";
        int c=s.length();
        String str="123";
        String str2="123";
        String str3="1";
        String str4="23";
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3+str4));
        System.out.println(str==(str3+str4));
//        Person per=new Person();
//        Person per2=new Person();
//        System.out.println(per.equals(per2));
    }
}
