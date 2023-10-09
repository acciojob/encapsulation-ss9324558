package com.driver;

public class Main {
    public static void main(String[] args) {
//        RWOnly obj=new RWOnly();
////        obj.name="Suraj";
////        name has private access in RWOnly
////        System.out.println(name);
//        obj.setName("Suraj");
//        obj.getName();
        RWOnly obj=new RWOnly();
        System.out.println(obj.getName());
        obj.setName("ram");
        System.out.println(obj.getName());
    }
}