package practise.p03;

public class Dog {
    public void bite() {
        System.out.println("汪汪叫");
    }

    public void bite(String str) {
        System.out.println("咬骨头，好香啊");
    }

    public void bite(Person p) {
        if (p.getSex().equals("男")) {
            System.out.println("扑上去撕咬");
        } else {
            System.out.println("清一口");
        }
    }

}
