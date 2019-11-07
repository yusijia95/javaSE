package practise.p03;

public class XiaoMing extends Person implements Inter {

    @Override
    public void tools() {
     System.out.println("小明坐大巴");
    }
    @Override
    public void study(){
        System.out.println("学习");
    }
    @Override
    public void play(){
        System.out.println("玩");
    }

}
