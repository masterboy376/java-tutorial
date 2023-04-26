package com.company;

class A{
    public int m1(){
        return 4;
    }
    public void  m2(){//method 2 of class A (orignal)
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override // override annotation --> just work as a safty flag
    public void m2(){// method 2 of class B (overrided) --> no overload: overloading take place in same class while, overriding take place in two different class.
        System.out.println("I am method 2 (overloaded) of class B");
    }
    public void m3(){
        System.out.println("I am method 3 of class B");
    }

}
public class MethodOverridingInInheritance_48 {
    public static void main(String[] args) {
        A a = new A();
        a.m2();

        B b = new B();
        b.m2();
    }
}
