package practise.p04;

public class ThreeThread extends Thread{
    CommonClass common;
    public ThreeThread(CommonClass common){
        this.common=common;
    }
    @Override
    public void run() {
        while(true){
            synchronized(common){
                if(common.FirCount==1&&common.SecCount==2){
                    System.out.println(ThreeThread.currentThread().getName()+"     "+common.number--);
                    if(common.FirCount==2){
                        common.SecCount=1;
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
