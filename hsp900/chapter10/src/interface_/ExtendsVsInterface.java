package interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();

    }
}
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name +"猴子会爬树...");
    }
}
//实现接口 是对java单继承机制的一种补充
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("通过学习,像鱼一样游水...");
    }

    @Override
    public void flying() {
        System.out.println("通过学习,像鸟一样飞翔...");
    }
}

