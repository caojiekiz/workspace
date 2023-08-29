package static_;

public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("tom");
        tom.payFee(100);
        Student mary = new Student("mary");
        //mary.payFee(200);
        Student.payFee(300);
        // System.out.println();
        Student.showFee();
        System.out.println(MyTools.calSum(10, 40));
    }
}
//开发自己的工具类,可以将方法做成静态方法
class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}
class Student {
    private String name;
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }
    //说明
    //1.当方法使用了static 修饰后,该方法就是静态方法
    //2.静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Student.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有:" + Student.fee);
    }
}
