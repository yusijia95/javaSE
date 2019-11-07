package example.e01;

public class MyRunnable implements Runnable {
    int ticket = 400;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 200; i++) {
//            synchronized(this) {
                if (ticket > 199) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(ticket%2==1) {
                        System.out.println(Thread.currentThread().getName() + "  第" + ticket-- + "张票");
                    }else{
                        System.out.println("第" + ticket-- + "张票");
                    }
//                }
            }
        }
    }
}
