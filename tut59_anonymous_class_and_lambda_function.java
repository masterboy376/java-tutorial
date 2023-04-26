package com.company;


@FunctionalInterface
interface Lambda{
    public void m1();
}
class LambdaUse implements Lambda{
    @Override
    public void m1() {
        System.out.println("I am lambda");
    }
}
interface DemoAno{
    public void meth1();
    public void meth2();
}
class AnonyDemo implements DemoAno{
    @Override
    public void meth1() {
        System.out.println("hello");
    }
    @Override
    public void meth2() {
        System.out.println("hi");
    }
}

public class AnonymousClassAndLambdaExpression_109 {
    public static void main(String[] args) {
        //Normally
        AnonyDemo ano = new AnonyDemo();
        ano.meth1();
        ano.meth2();

        Lambda lam= new LambdaUse();
        lam.m1();

        //Dynamic dispatch method in interfaces
        DemoAno DA = new AnonyDemo();
        DA.meth1();
        DA.meth2();

        //Anonymous class --> reference of a interface
        DemoAno objAno = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("hello, i am anonymous class");
            }
            @Override
            public void meth2() {
                System.out.println("hi, i am anonymous class");
            }
        };
        objAno.meth1();
        objAno.meth2();

        // Lambda expression --> used for functional interface
        Lambda objlam = ()->{
            System.out.println("I am lambda using, Lambda Expression");
        };
        objlam.m1();
    }
}
