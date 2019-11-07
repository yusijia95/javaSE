package practise.p01;

public class MyRunnable implements Runnable {
    private int money = 1000;
    private int moneyFirst = 0;
    private int moneySecond = 0;

    @Override
    public void run() {
        while (money > 0) {
            synchronized (this) {
                if (money == 100) {
                    if (Thread.currentThread().getName().equals("Thread-0")) {
                        moneyFirst += 100;
                        money -= 100;
                        System.out.println(Thread.currentThread().getName() + "    " + money + "   " + moneyFirst);
                    }
//                    else {
//                        Thread.interrupted();
//                        System.out.println("没钱了");
//                    }
                } else if(money>100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (Thread.currentThread().getName().equals("Thread-0")) {
                        moneyFirst += 100;
                        money -= 100;
                        System.out.println(Thread.currentThread().getName() + "    " + money + "   " + moneyFirst);
                    } else {
                        moneySecond += 200;
                        money -= 200;
                        System.out.println(Thread.currentThread().getName() + "    " + money + "    " + moneySecond);
                    }
                }
            }
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoneyFirst() {
        return moneyFirst;
    }

    public void setMoneyFirst(int moneyFirst) {
        this.moneyFirst = moneyFirst;
    }

    public int getMoneySecond() {
        return moneySecond;
    }

    public void setMoneySecond(int moneySecond) {
        this.moneySecond = moneySecond;
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "moneyFirst=" + moneyFirst +
                ", moneySecond=" + moneySecond +
                '}';
    }
}
