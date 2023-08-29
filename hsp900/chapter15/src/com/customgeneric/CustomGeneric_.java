package com.customgeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger<Object, Object, Object> g = new Tiger<>("john") ;
    }
}
class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }
}