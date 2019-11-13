package practise.p03;

/**
 * @author edz
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        CommonClass common = new CommonClass(1, 1);
        FirstThread thread1 = new FirstThread(common);
        SecondThread thread2 = new SecondThread(common);
        ThreeThread thread3 = new ThreeThread(common);
        NotifyThread notifyThread = new NotifyThread(common);
        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();
        thread3.start();

        notifyThread.start();
    }
}
