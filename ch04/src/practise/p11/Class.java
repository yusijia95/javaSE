package practise.p11;

public class Class {
    private String name;
    private int number;

    public Class() {
    }

    public Class(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
