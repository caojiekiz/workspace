package com.object.equals0318;

public class Equals {
    public static void main(String[] args) {
      A a = new A();
      A b = a;
      A c = b;
      System.out.println(a == c);
      System.out.println(b == c);
      B bObj = a;
      System.out.println(bObj == c);
      int num1 = 10;
      double num2 = 10.0;
      System.out.println(num1 == num2);
      "hello".equals("hello");
      Integer integer1 = new Integer(1000);
      Integer integer2 = new Integer(1000);
      System.out.println(integer1 == integer2);
      System.out.println(integer1.equals(integer2));

    }
}
class B {}
class A extends B{}
