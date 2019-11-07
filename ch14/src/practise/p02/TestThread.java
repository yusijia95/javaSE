package practise.p02;

public class TestThread {
    public static void main(String[] args) {
        Food food=new Food();
        SetFoodThread set=new SetFoodThread(food);
        GetFoodThread get=new GetFoodThread(food);
        set.start();
        get.start();
    }
}
