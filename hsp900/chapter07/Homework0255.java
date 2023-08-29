package chapter07;

public class Homework0255 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Circle circle = new Circle(1);
	System.out.println("面积 = " + circle.area());
	System.out.println("周长 = " + circle.len());
}

}
class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {//面积
		return Math.PI * radius * radius;
	}	
	public double len() {
		return 2 * Math.PI * radius;
	}

}