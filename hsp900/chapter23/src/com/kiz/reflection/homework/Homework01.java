package com.kiz.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestObj = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj,"天龙八部");
        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name的属性= " + invoke);
    }
}
class PrivateTest {
    private String name = "hellokitty";
    public String getName() {
        return name;
    }

}