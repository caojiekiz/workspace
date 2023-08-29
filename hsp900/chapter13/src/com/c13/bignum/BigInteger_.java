package com.c13.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("234989999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
    }
}
