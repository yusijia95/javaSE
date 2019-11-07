package practise.p07;

public class TestStudent {
    public static void main(String[] args) {
        Student stuFrist = new Student(24, "俞思笳", "男", 25);
        Student stuSecond = new Student(24);
        stuSecond.setAge(23);
        stuSecond.setName("利好");
        stuSecond.setSex("女");
        System.out.println(stuFrist.toString());
        System.out.println(stuSecond.toString());
    }
}
