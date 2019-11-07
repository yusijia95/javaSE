package example.e02;

public class MyRunnable implements Runnable {
    int i=1;
    @Override
    public void run() {
        synchronized (this){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"   第"+i+++"名");
        }
    }
}
