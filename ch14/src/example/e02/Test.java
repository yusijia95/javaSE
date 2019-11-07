package example.e02;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        MyThread[] thread = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new MyThread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }
}
