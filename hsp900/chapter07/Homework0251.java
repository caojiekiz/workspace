package chapter07;

public class Homework0251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01 a01 = new A01();
		double[] arr = {1.3, 3.4, 2,1,5.1};
		//double[] arr = null;
		Double res = a01.max(arr);
		if(res != null) {
			System.out.println("arr的最大值是 " + res);
		} else {
			System.out.println("输入的数组有误!");
		}
	}

}
class A01 {
	//最大值功能模块
	public Double max(double[] arr) {
		//保证arr至少有一个元素,防止传入空数组
		if(arr != null && arr.length > 0) {//判断数组不能为null
			double max = arr[0];//设第一个值为最大值,然后再比较
			for(int i = 1; i < arr.length; i++) {
				 if(max < arr[i]) {
					 max = arr[i];
				 }
			}
			return max;
		} else {
			return null;
		}
	}
}