package com.driver;

public class Main {
    public static void main(String[] args)
    {
        RWOnly obj=new RWOnly();
        System.out.println(obj.getName());
        obj.setName("ram");
        System.out.println(obj.getName());
    }
  
}