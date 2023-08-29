package chapter07;

public class Homework0254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArr = {3,4,5,6,7};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(oldArr);
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

}
class A03 {
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];//新建一个数组,然后遍历元素复制
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}