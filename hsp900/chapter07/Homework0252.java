package chapter07;

public class Homework0252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"today", "moday", "tuday", "wenday", "thday"};
		//String[] strs = null;
		A02 a02 = new A02();
		Integer index = a02.find("tsuday", strs);
		if(index != null) {
			System.out.println("查找的index = " + index);
		} else {
			System.out.println("输入的数组有误!");
		}		
	}

}
class A02 {
	public Integer find(String findStr, String[] strs) {
		if(strs != null && strs.length > 0) {
			for(int i = 0; i < strs.length; i++) {
				if(findStr.equals(strs[i])) {
					return i;
				}
			}
		
			return -1;
		} else {
			return null;
		}
	}
}