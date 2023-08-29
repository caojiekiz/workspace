package chapter07;

public class MethodExercise0209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB a = new AB();
		if(a.isOdd(2)) {
			System.out.println("是奇数 " );
		} else {
			System.out.println("不是奇数 " );
		}
		a.print(5, 5, '&');
	}

}
class AB {
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}
	public void print(int row, int col, char c ) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}