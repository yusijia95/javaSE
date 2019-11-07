package practise.p15;

import java.math.BigDecimal;

public class JewEmployee extends Unemployee implements Employee {
    private int jewNumber;

    @Override
    public BigDecimal salary() {
        return BigDecimal.valueOf(jewNumber*50);
    }

    public JewEmployee() {
    }

    public JewEmployee(int jewNumber) {
        this.jewNumber = jewNumber;
    }

    public JewEmployee(String name, int jewNumber) {
        super(name);
        this.jewNumber = jewNumber;
    }

    @Override
    public String toString() {
        return "JewEmployee{" +
                "jewNumber=" + jewNumber +
                '}';
    }

    public int getJewNumber() {
        return jewNumber;
    }

    public void setJewNumber(int jewNumber) {
        this.jewNumber = jewNumber;
    }
}
