package practise.p05;

public class Employee extends Role {
    private Double salary;
    public static int ID=111;

    @Override
    public void play() {
        System.out.println("我会玩");
    }

    public final void sing(){
        System.out.println("我会唱歌");
    }

    public Employee() {
        System.out.println("nihao");
    }

    public Employee(Double salary) {
        this();
        this.salary = salary;
    }

    public Employee(String name, int age, String sex, Double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
