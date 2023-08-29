package chapter07;

public class MethodParameter0210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		AC aa = new AC();
		
		aa.swap(10, 20); 
	}

}
class AC {
	public void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a=" + a + "\tb=" + b); 
	}
}