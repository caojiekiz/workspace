package codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好!李焕英");
        System.out.println("========");
        Movie tt = new Movie("通天帝国", 49, "导演1");

    }

}
class Movie {
    private String name;
    private double price;
    private String director;
    //3个构造器 重载
    //  把相同语句,放入到一个代码块中,不管调用那个构造器,都会先调用代码块内容
    //代码块的调用优先构造器
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始....");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}