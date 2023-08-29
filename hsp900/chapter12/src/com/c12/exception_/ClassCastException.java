package com.c12.exception_;

public class ClassCastException {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B)b;
        C c2 = (C)b;
    }
}
class A {}
class B extends A {}
class C extends A {}
