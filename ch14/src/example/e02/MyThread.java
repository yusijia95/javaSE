package example.e02;

public class MyThread extends Thread {

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread() {
    }
}
