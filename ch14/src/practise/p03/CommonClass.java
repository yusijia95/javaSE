package practise.p03;

public class CommonClass extends Thread {
    int number;
    int count;

    public CommonClass(int number, int count) {
        this.number = number;
        this.count = count;
    }
}
