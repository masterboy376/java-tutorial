package com.company;


class th implements Runnable{
    public void run(){
        System.out.println("hello");
    }
}

class MyTh extends Thread{
    public MyTh(Runnable r, String name){
        super(name);
    }
    public MyTh(String name) {
        super(name);
    }
    public void run(){
        System.out.println("hi");
        //while(true){
        //    System.out.println("I am a thread.");
        //}
    }
}


public class ThreadConstructors_73 {
    public static void main(String[] args) {
        th Run = new th();
        Thread go = new Thread(Run);
        //--------------------------------------------------------------------------------------------------------------
        MyTh t3 = new MyTh(go,"alpha");
        t3.start();
        go.start();
        //--------------------------------------------------------------------------------------------------------------
        MyTh t1 = new MyTh("sambhav");
        MyTh t2 = new MyTh("sam");
        t1.start();
        t2.start();
        System.out.println("The ID of the thread is "+ t1.getId());
        System.out.println("The ID of the thread is "+ t2.getId());
        System.out.println("The name of the thread is "+ t1.getName());
        System.out.println("The name of the thread is "+ t2.getName());
        System.out.println(t1.getContextClassLoader());
        System.out.println(t2.getState());
        System.out.println(t1.getStackTrace());
        System.out.println(t2.getPriority());
// there are many thread methods.
    }
}
