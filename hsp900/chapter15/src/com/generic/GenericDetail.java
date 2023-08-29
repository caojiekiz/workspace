package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //
        Pig<A> aPig = new Pig<A>(new A());

        Pig<A> aPig2 = new Pig<A>(new B());

    }
}
class A {

}
class B extends A {

}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
}
