package chapter04;

public class Test0074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean x = true;
		 boolean y = false;
		 short z = 46;
		 if((z++ == 46) && (y = true)) z++;
		 if((x = false) || (++z == 49)) z++;
		 System.out.println("z = " + z);
	}

}
