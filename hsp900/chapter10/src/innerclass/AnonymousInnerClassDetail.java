package innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05 {
    private int n1 = 99;
    public void f1() {
        Person person = new Person();
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重新了HI方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        };
//        new Person() {
//            @Override
//            public void hi() {
//                System.out.println("匿名内部类重新了HI方法");
//            }
//
//            @Override
//            public void ok(String str) {
//                super.ok(str);
//            }
//        }.ok("jack");
//        //person.hi();
    }
}
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}