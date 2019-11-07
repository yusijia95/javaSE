package practise.p15;

import java.math.BigDecimal;

public class HourEmployee extends Unemployee implements Employee {
    private int workTime;
    private int hourSalary;

    @Override
    public BigDecimal salary() {
        return BigDecimal.valueOf(workTime*hourSalary);
    }

    public HourEmployee() {
    }

    public HourEmployee(int workTime, int hourSalary) {
        this.workTime = workTime;
        this.hourSalary = hourSalary;
    }

    public HourEmployee(String name, int workTime, int hourSalary) {
        super(name);
        this.workTime = workTime;
        this.hourSalary = hourSalary;
    }

    @Override
    public String toString() {
        return "HourEmployee{" +
                "workTime=" + workTime +
                ", hourSalary=" + hourSalary +
                '}';
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }
}
