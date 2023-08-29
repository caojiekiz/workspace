package chapter07;

public class MiGone0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建迷宫 int[][] map = 
		//2.规定0表示可以走,1表示障碍物
		 int[][] map = new int[8][7];
		 //3.最上面的一行和最下面的一行,全部设置为1
		 for(int i = 0; i < 7; i++) {
			 map[0][i] = 1;
			 map[7][i] = 1;
		 }
		 //4.最左边和最右边一行设置为1
		 for(int i = 0; i < 8; i++) {
			 map[i][0] = 1;
			 map[i][6] = 1;
		 }
		 //5.单独设置
		 map[3][1] = 1;
		 map[3][2] = 1;
		 //map[2][2] = 1;
		 //输出当前的地图
		 for(int i = 0; i < map.length; i++) {
			 for(int j = 0; j < map[i].length; j++) {
				 System.out.print(map[i][j] + " ");
			 }
			 System.out.println();
		 }
		 //使用findway
		 M m1 = new M();
		 m1.findWay(map, 1, 1);
		 //m1.findWay2(map, 1, 1);//第二种找路策略
		 System.out.println("====找路情况如下=====");
		 for(int i = 0; i < map.length; i++) {
			 for(int j = 0; j < map[i].length; j++) {
				 System.out.print(map[i][j] + " ");
			 }
			 System.out.println();
		 }
	}
}
class M {
	public boolean findWay(int[][] map, int i, int j) {
		//0表示可以走 1表示障碍物 2表示可以走 3表示走过,但是走不通是思路
		//当map[6][5] =2是表示找到通路,否则就继续找.
		//找路策略 下-右-上-左
		if(map[6][5] == 2) {//说明已找到路
			return true;
		} else {
			if(map[i][j] == 0) {//当前这个位置是0,表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//找路策略 下-右-上-左
				if(findWay(map, i + 1, j)) {//先往下走
					return true;
				} else if(findWay(map, i, j + 1)) {
					return true;
				} else if(findWay(map, i - 1, j)) {
					return true;
				} else if(findWay(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
	public boolean findWay2(int[][] map, int i, int j) {
		//0表示可以走 1表示障碍物 2表示可以走 3表示走过,但是走不通是思路
		//当map[6][5] =2是表示找到通路,否则就继续找.
		//第二种策略 上-右-下-左
		if(map[6][5] == 2) {//说明已找到路
			return true;
		} else {
			if(map[i][j] == 0) {//当前这个位置是0,表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//第二种找路策略 下-右-上-左
				if(findWay2(map, i - 1, j)) {//先往下走
					return true;
				} else if(findWay2(map, i, j + 1)) {
					return true;
				} else if(findWay2(map, i + 1, j)) {
					return true;
				} else if(findWay2(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
