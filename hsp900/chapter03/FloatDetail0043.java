package chapter03;
/**
 * @author dreamtank
 *
 */
public class FloatDetail0043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num2 = 1.1f;
		double num3 = 1.1;
		double num4 = 1.1f;
		double num5 = .123;
		System.out.println(num5);
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		//
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);
		System.out.println(num12);
		//判断する
		if( num11 == num12 ) {
			System.out.println("equal");
		}
		if( num11 != num12 ) {
			System.out.println("unequal");
		}
		if(Math.abs(num11 - num12) < 0.000001) { 
			System.out.println("equal");
		}
	}

}
