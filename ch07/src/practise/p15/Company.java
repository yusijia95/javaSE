package practise.p15;

import java.math.BigDecimal;
import java.util.Arrays;

public class Company {
    public Unemployee[] worker;

    public void add(Unemployee[] worker, Unemployee employee) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] == null) {
                worker[i] = employee;
                break;
            }
        }
    }

    public void delete(String name) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null && name.equals(worker[i].getName())) {
                worker[i] = null;
                for (int j = i; j < worker.length - 1; j++) {
                    worker[j] = worker[j + 1];
                }
            }
        }
    }

    public BigDecimal personSalary(String name) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null && name.equals(worker[i].getName())) {
                if (worker[i].getClass() == (new HourEmployee()).getClass()) {
                    HourEmployee hourEmployee = (HourEmployee) worker[i];
                    return hourEmployee.salary();
                }
                if (worker[i].getClass() == (new SaleEmployee()).getClass()) {
                    SaleEmployee saleEmployee = (SaleEmployee) worker[i];
                    return saleEmployee.salary();
                }
                if (worker[i].getClass() == (new CommonEmployee()).getClass()) {
                    CommonEmployee commonEmployee = (CommonEmployee) worker[i];
                    return commonEmployee.salary();
                }
            }
        }
        return BigDecimal.valueOf(0);
    }

    public BigDecimal sumSalary() {
        BigDecimal sum=new BigDecimal(0);
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getClass() == (new HourEmployee()).getClass()) {
                HourEmployee hourEmployee = (HourEmployee) worker[i];
                sum=sum.add(hourEmployee.salary());
            }
            if (worker[i].getClass() == (new SaleEmployee()).getClass()) {
                SaleEmployee saleEmployee = (SaleEmployee) worker[i];
                sum=sum.add(saleEmployee.salary());
            }
            if (worker[i].getClass() == (new CommonEmployee()).getClass()) {
                CommonEmployee commonEmployee = (CommonEmployee) worker[i];
                sum=sum.add(commonEmployee.salary());
            }
        }
        return sum;
    }

    public Company() {
    }

    public Company(Unemployee[] worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Company{" +
                "worker=" + Arrays.toString(worker) +
                '}';
    }

    public Unemployee[] getWorker() {
        return worker;
    }

    public void setWorker(Unemployee[] worker) {
        this.worker = worker;
    }
}

