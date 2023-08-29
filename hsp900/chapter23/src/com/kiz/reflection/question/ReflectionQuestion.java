package com.kiz.reflection.question;

import com.kiz.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat();
        cat.hi();
        //通过properties类,可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath" + classfullpath);
        System.out.println("method=" + method);
        //使用反射机制
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型是" + o.getClass());
        //
        Method method1 = cls.getMethod(method);
        System.out.println("======");
        method1.invoke(o);
    }
}
