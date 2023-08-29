package codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //AA aa = new AA();
        //创建
        AA aa2 = new AA();
        System.out.println(Cat.n1);
        //static 代码块
        //DD dd = new DD();
        //DD dd1 = new DD();
        System.out.println(DD.n1);
    }
}
class DD {
    public static int n1 = 111;
    static {
        System.out.println("DD 的静态代码1被执行....");
    }
    {
        System.out.println("DD的普通代码块");
    }
}
class Animal {

    static {
        System.out.println("Animal 的静态代码1被执行....");
    }
}

class Cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("cat 的静态代码1被执行....");
    }
}
class BB {
    //静态代码块
    static {
        System.out.println("BB 的静态代码1被执行....");
    }
}
class AA extends BB {
    //静态代码块
    static {
        System.out.println("AA 的静态代码1被执行....");
    }
}