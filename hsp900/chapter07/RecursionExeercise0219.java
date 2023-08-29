package chapter07;

public class RecursionExeercise0219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Re re = new Re();
		int n2 = 8;//传入的数
		int n1 = re.fibonacci(n2);
		if(n1 != -1) {
			  System.out.println("当n=" + n2 +"时,对应的斐波那契数是 " + n1);
		}		
		//0220 猴子吃桃子 练习
		int day = 10;
		int peachNum = re.peach(day);
		if(peachNum != -1) {
			System.out.println("第" + day +"天时,有 " + peachNum + "个桃子!");
		}
	}

}

class Re {
	public int fibonacci(int n) {
		if(n >= 1) {
				if(n == 1 || n == 2) {		
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("要求输入n>=1的整数");
			return -1;
		}
	}
	//0220 猴子吃桃子 练习
	public int peach(int day) {
		if(day == 10) {//第10天只有1个桃子
			return 1;
		} else if(day >= 1 && day <= 9) {
			//规律 前一天的桃子 = (后一天的桃子 +1) *2
			return(peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day 在1-10");
			return -1; 
		}
	}

}









