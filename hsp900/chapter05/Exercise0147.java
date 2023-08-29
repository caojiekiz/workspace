package chapter05;

public class Exercise0147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money = 100000;
		double tax1 = 0.05;
		int tax2 = 1000;
		int changeTax = 50000;
		int time = 0;
//		while(money > 0) {
//			if(money > 50000) {
//				money *= 1-tax1;
//				time++;
//			} else if(money >=1000) {
//				money -= 1000;
//				time++;
//			} else {
//				break;
//			}
//		}
		while(money >= tax2) {
			if(money > 50000) {
				money *= 1-tax1;
			} else if(money >=1000) {
				money -= 1000;
			} 
			time++;
		}
		System.out.println("可以经过" + time + "次路口");
	}

}
