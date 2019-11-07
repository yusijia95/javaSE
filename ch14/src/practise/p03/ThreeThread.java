package practise.p03;

public class ThreeThread extends Thread {
    CommonClass common;

    public ThreeThread(CommonClass common) {
        this.common = common;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (common) {
                if (common.count == 3) {
                    if (common.number < 75) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + "     " + common.number++);
                        }
                        common.count = 1;
                        try {
                            common.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
