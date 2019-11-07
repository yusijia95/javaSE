package practise.p02;

public class SetFoodThread extends Thread {
    Food food;

    public SetFoodThread(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (food) {
                if (food.flag) {
                    food.name = "苹果";
                    food.flag=false;
                }else{
                    food.name="草莓";
                    food.flag=true;
                }
                System.out.println(Thread.currentThread().getName()+food.name);
                food.notify();
                try {
                    food.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
