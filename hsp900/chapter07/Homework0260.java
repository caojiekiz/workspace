package chapter07;

public class Homework0260 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Circle02 c = new Circle02();
	//System.out.println("面积 = " + circle.area());
	//System.out.println("周长 = " + circle.len());
	PassObject po = new PassObject();
	po.printArea(c, 5);
}

}
class Circle02 {
	double radius;
	public Circle02() { 
	}
	public Circle02(double radius) {
		this.radius = radius;
	}
	public double findArea() {//面积
		return Math.PI * radius * radius;
	}	
	//添加setRadius方法,修改对象的半径值
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class PassObject {
	public void printArea(Circle02 c, int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c.setRadius(i);//修改c对象的半径值
			System.out.println((double)i + "\t" + c.findArea());
		}
	}
}