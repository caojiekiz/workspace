package com.kiz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        SaleComputer proxy_lenovo = (SaleComputer)Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("invoke is running");
//                System.out.println(method.getName());
//                System.out.println(args[0]);
                if(method.getName().equals("sale")) {
                    double money = (double) args[0];
                    money = money * 0.85;
                    String obj = (String)method.invoke(lenovo, money );
                    //增强返回值
                    return obj + "mat";
                }else{
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }

            }
        });
        String sale = proxy_lenovo.sale(8000);
        //System.out.println(sale);
        //proxy_lenovo.show();
    }
}
