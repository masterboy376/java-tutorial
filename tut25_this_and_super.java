package com.company;

//*************************************************************
class base1 {
    base1(){
        System.out.println("I am a base class constructor.");
    }
    base1(int x){
        System.out.println("I am overloaded x ="+ x);
    }
}
//*************************************************************
class derived1 extends base1 {
    derived1(){
        System.out.println("I am derived1 class constructor.");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am overloaded y = "+y);
    }
}
//*************************************************************
class derived2 extends derived1{
    derived2(){
        System.out.println("I am derived2 class constructor.");
    }
    derived2(int x, int y, int z){
        super(x, y);
        System.out.println("I am overloaded z = "+z);
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class ConstructorsInJava_46 {
    public static void main(String[] args) {
        base1 b1 = new base1(14);
        derived1 d1 = new derived1(14,6);
        derived2 d2 = new derived2(14,6,8);
    }
}
