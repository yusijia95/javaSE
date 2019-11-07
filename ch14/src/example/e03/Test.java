package example.e03;


public class Test {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        MyThread thread1=new MyThread(runnable);
        MyThread thread2=new MyThread(runnable);
        thread1.start();
        thread2.start();
    }
}
