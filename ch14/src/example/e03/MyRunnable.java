package example.e03;

public class MyRunnable implements Runnable {
    Integer i = 2;
    Integer j = 2;
    String z = "2";

    @Override
    public void run() {
        if (i-- == 2) {
            synchronized (z) {
                System.out.println(Thread.currentThread().getName() + "有栗子");
                synchronized (j) {
                    System.out.println(Thread.currentThread().getName() + "想要苹果");
                }
            }

        } else {
            synchronized (j) {
                System.out.println(Thread.currentThread().getName() + "有苹果");
                synchronized (z) {
                    System.out.println(Thread.currentThread().getName() + "想要栗子");
                }
            }

        }
    }
}
