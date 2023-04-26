package com.company;

abstract class parent{
    public parent(){
        System.out.println("constructor of base2");
    }
    public void sayhello(){
        System.out.println("Hello!");
    }
    abstract public void greet1();
    abstract public void greet();// it has decleared a standard for its sub class, which should include this method.
    // abstract class is a set of rules for its derived class.
}

class child1 extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good afternoon");
    }
}

abstract class child2 extends parent{// didn't override the abstract methods.
    public void IWillNotOverride(){
        System.out.println("Hence, i am new abstract class:-)");
    }

}
public class AbstractClassesAndInterface_53 {
    public static void main(String[] args) {
        child1 obj = new child1();
        parent obj1 = new child1();
        //parent obj2 = new parent();// not possible
        //child2 obj3 = new child2();// not possible

    }
}
