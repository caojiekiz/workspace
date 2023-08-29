package com.kiz.reflection.question;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;



public class Reflection01 {
    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath" + classfullpath);
        System.out.println("method=" + method);

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型是" + o.getClass());
        //
        Method method1 = cls.getMethod(method);
        System.out.println("======");
        method1.invoke(o);
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));
        //构造器
        //Constructor[] constructors = cls.getConstructors();
        Constructor constructor = cls.getConstructor();

        System.out.println(constructor);
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
