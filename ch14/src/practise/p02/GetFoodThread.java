package practise.p02;

public class GetFoodThread extends Thread {
    Food food;
    public GetFoodThread(Food food){
        this.food=food;
    }

    @Override
    public void run() {
        while(true){
            synchronized (food){
                System.out.println(Thread.currentThread().getName()+"我拿到了"+food.name);
                food.notify();
                try{
                        food.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
