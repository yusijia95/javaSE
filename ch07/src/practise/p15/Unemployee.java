package practise.p15;

import java.math.BigDecimal;

public class Unemployee  {
    private String name;

    public Unemployee() {
    }

    public Unemployee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Unemployee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
