package practise.p15;

import java.math.BigDecimal;

public class SaleEmployee extends Unemployee implements Employee {
    private int salesAmmount;
    private int basicSalary;

    @Override
    public BigDecimal salary() {
        BigDecimal deduction=new BigDecimal(salesAmmount);
        if (salesAmmount > 10000) {
            deduction=deduction.multiply(BigDecimal.valueOf(0.15));
            if (salesAmmount > 100000) {
                deduction=deduction.multiply(BigDecimal.valueOf(0.18));
            }
        }else{
            deduction=deduction.multiply(BigDecimal.valueOf(0.1));
        }
        return deduction.add(BigDecimal.valueOf(basicSalary));
    }

    public SaleEmployee() {
    }

    public SaleEmployee(int salesAmmount, int basicSalary) {
        this.salesAmmount = salesAmmount;
        this.basicSalary = basicSalary;
    }

    public SaleEmployee(String name, int salesAmmount, int basicSalary) {
        super(name);
        this.salesAmmount = salesAmmount;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "SaleEmployee{" +
                "salesAmmount=" + salesAmmount +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public int getSalesAmmount() {
        return salesAmmount;
    }

    public void setSalesAmmount(int salesAmmount) {
        this.salesAmmount = salesAmmount;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
