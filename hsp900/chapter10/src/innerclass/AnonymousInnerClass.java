package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 {
    private int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型= "+ father.getClass());
        father.test();
        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小动物在吃食物...");
            }
        };
        animal.eat();
    }
}
interface IA {
    public void cry();
}
//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}
class Father {
    public Father(String name) {

    }
    public void test() {

    }
}
abstract class Animal {
    abstract void eat();
}