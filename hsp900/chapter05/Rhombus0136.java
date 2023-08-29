package chapter05;

public class Rhombus0136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int totalLevel = 100;
		for(int i = 1; i <= totalLevel; i++) {
			for(int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (2 * i - 1); j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
