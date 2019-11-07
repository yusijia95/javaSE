package summary.s02;

import java.math.BigDecimal;

public class Worker {
    private int age;
    private String name;
    private double salary;

    @Override
    public int hashCode() {
        return (int) (name.hashCode()+age+salary);
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag=false;
        Worker work=(Worker)obj;
        if(obj==null){
            return false;
        }
        if(obj==this){
            flag=true;
            return flag;
        }
        if(((Worker) obj).getName().length()!=this.name.length() || !((Worker) obj).getName().equals(this.name)){
            return flag;
        }
        if(((Worker) obj).getAge()!=this.getAge()){
            return flag;
        }
        BigDecimal de1=new BigDecimal(((Worker) obj).getSalary());
        BigDecimal de2=new BigDecimal(this.getSalary());
        if(de1.equals(de2)){
            flag=true;
            return flag;
        }
        return flag;
    }

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "work");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

