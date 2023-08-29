package chapter06;

public class YangHui0181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] yanghui = new int[10][]; 
		
		for(int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i + 1];//需要给每个一维数组开空间new
			for(int j = 0; j < yanghui[i].length; j++ ) {//遍历一维数组，并赋值
				if(j == 0 || j == yanghui[i].length - 1 ) {
					yanghui[i][j] = 1;
				} else {
					yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
				}
			}
		}
		for(int i = 0; i < yanghui.length; i++ ) {//遍历输出
			for(int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
