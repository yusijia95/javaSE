package practise.p04;

public class NotifyThread extends Thread {
    CommonClass common;

    public NotifyThread(CommonClass common) {
        this.common = common;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (common) {
                common.notify();
            }
        }
    }
}

