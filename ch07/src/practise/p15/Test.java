package practise.p15;

import java.math.BigDecimal;

/**
 * @author edz
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        company.worker=new Unemployee[10];
        Unemployee unemployee1 = new HourEmployee("俞思笳1",10,200);
        Unemployee unemployee2 = new HourEmployee("俞思笳2",10,230);
        Unemployee unemployee3 = new SaleEmployee("俞思笳3",5000,2000);
        Unemployee unemployee4 = new SaleEmployee("俞思笳4",200000,2000);
        Unemployee unemployee5 = new CommonEmployee("俞思笳5",205,6000);
        Unemployee unemployee6 = new JewEmployee("俞思笳6",30);
        company.add(company.worker, unemployee1);
        company.add(company.worker, unemployee2);
        company.add(company.worker, unemployee3);
        company.add(company.worker, unemployee4);
        company.add(company.worker, unemployee5);
        company.delete(unemployee1.getName());
        System.out.println(company.toString());
        BigDecimal in=company.personSalary("俞思笳2");
        System.out.println(in);
//        System.out.println(company.worker[0].getClass());

    }
}
