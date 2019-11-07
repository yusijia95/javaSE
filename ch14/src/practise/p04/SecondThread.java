package practise.p04;

public class SecondThread extends Thread {
    CommonClass common;
    public SecondThread(CommonClass common){
        this.common=common;
    }

    @Override
    public void run() {
        while(true){
            synchronized(common){
                if(common.FirCount==2&&common.SecCount==1){
                    System.out.println(ThreeThread.currentThread().getName()+"     "+common.number++);
                    if(common.FirCount==2){
                        common.SecCount=2;
                        common.FirCount=1;
                    }else {
                        common.FirCount++;
                    }
                    try {
                        common.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
