package static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child1 = new Child("baigujing");
        child1.join();
        //count++;
        child1.count++;
        Child child2 = new Child("laoshujing");
        child2.join();
        //count++;
        child2.count++;
        Child child3 = new Child("hulijing");
        child3.join();
        //count++;
        child3.count++;
        //类变量可以用类名直接访问
        System.out.println("共有" + Child.count + "小孩加入了游戏");

    }
}
class Child {
    private String name;
    //定义一个类变量(静态变量)
    //该变量会被child类的所有的对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏!");
    }

}
