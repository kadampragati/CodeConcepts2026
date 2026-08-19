package com.my.code.java8concepts;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " +id + " name:" + name ;
    }
}
public class LambdaCompareToTest {
    public static void main(String[] args) {

        ArrayList<Employee> arrList = new ArrayList<Employee>();
        arrList.add(new Employee(1, "Anny"));
        arrList.add(new Employee(10, "Jenny"));
        arrList.add(new Employee(5, "Chiny"));
        arrList.add(new Employee(9, "Sony"));
        arrList.add(new Employee(2, "Bella"));
        System.out.println(arrList);
        Collections.sort(arrList, (e1,e2) -> e1.name.compareTo(e2.name));
        System.out.println(arrList);
    }
}
