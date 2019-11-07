package practise.p01;

/**
 * @author yusijia
 */
public class Test {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        MyThread thread1 = new MyThread(runnable);
        MyThread thread2 = new MyThread(runnable);
        thread1.start();
        thread2.start();
        thread1.setPriority(10);
//        if(runnable.getMoney()==0) {
//            System.out.println(runnable.getMoneyFirst());
//            System.out.println(runnable.getMoneySecond());
//        }
//        System.out.println(runnable.toString());
    }
}
