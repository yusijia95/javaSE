package practise.p04;

/**
 * @author edz
 */
public class TestThread {
    public static void main(String[] args) {
        CommonClass common=new CommonClass(0,1,1,1);
        FirstThread firstThread=new FirstThread(common);
        SecondThread secondThread=new SecondThread(common);
        ThreeThread threeThread=new ThreeThread(common);
        ForthThread forthThread=new ForthThread(common);
        NotifyThread notifyThread=new NotifyThread(common);
        firstThread.start();
        secondThread.start();
        threeThread.start();
        forthThread.start();
        notifyThread.start();
    }
}
