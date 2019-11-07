package example.e01;

public class MyThread extends Thread {

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread() {
    }
}
