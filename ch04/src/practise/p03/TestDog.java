package practise.p03;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Person p = new Person("男");
        Person p2 = new Person("女");
        dog.bite();
        dog.bite("ni");
        dog.bite(p);
        dog.bite(p2);
    }
}
