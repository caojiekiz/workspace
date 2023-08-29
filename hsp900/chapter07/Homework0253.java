package chapter07;

public class Homework0253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Book bk = new Book("tiantian",500);
		bk.info();//更新前
		bk.updatePirce();//更新价格
		bk.info();//显示更新后的信息
	}

}
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePirce() {
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
	//显示书籍的信息
	public void info() {
		System.out.println("书名是 " + this.name + "价格是 " + this.price);
	}
}