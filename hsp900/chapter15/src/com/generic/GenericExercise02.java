package com.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000,11,11)));
        employees.add(new Employee("jack", 10000, new MyDate(1990,1,15)));
        employees.add(new Employee("tom", 5000, new MyDate(1980,3,20)));
        System.out.println("employees = " + employees);
        System.out.println("===排序===");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序,如果name相同,则按生日日期的先后排序.
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确...");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                //如果name相同,比较 birth -year
                return emp1.getBirthday().compareTo(emp2.getBirthday());

            }
        });
        System.out.println(employees);
    }
}
