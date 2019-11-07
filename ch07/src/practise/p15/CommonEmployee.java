package practise.p15;

import java.math.BigDecimal;

public class CommonEmployee extends Unemployee implements Employee {
    private int workHour;
    private int basicSalary;

    @Override
    public BigDecimal salary(){
        return BigDecimal.valueOf(basicSalary+(workHour-196)*200);
    }

    public CommonEmployee() {
    }

    public CommonEmployee(int workHour, int basicSalary) {
        this.workHour = workHour;
        this.basicSalary = basicSalary;
    }

    public CommonEmployee(String name, int workHour, int basicSalary) {
        super(name);
        this.workHour = workHour;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "CommonEmployee{" +
                "workHour=" + workHour +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
