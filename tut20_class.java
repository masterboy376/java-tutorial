package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void print1(){// public due to existence of a custom class
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
        //System.out.println("my salary is "+salary+"$");
    }
    public int salary$(){
        return salary;
    }
}
public class ObjectOrientedProgrammingFirstCustomClass_38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        //--------------------------------------------------------------------------------------------------------------
        Employee sambhav = new Employee();// instantiating a new Employee object
        //setting attributes(properties)
        sambhav.id = 157487;
        sambhav.name = "Sambhav Kaushik";
        sambhav.salary = 999999999;
        //printing
        //System.out.println(sambhav.id);
        //System.out.println(sambhav.name);
        //setting methods(behaviours)
        sambhav.print1();
        System.out.println(sambhav.salary$());
    }
}
