package chapter05;

public class ContinueDetail0145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label1:
		for(int j= 0; j < 2; j++) {
			label2:
			for(int i = 0; i < 10; i++) {
				if(i == 2) {
					continue label1;
				}
				System.out.println("i = " + i);
			}
			
		}
	}

}
