package com.company;


//prob1
class th1 extends Thread{
    public void run(){
        while(true){
           // System.out.println("Good morning");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class th2 extends Thread{
    public void run(){
        while(true){
           System.out.println("Welcome");
            //prob2
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class PracticeSet13_76 {
    public static void main(String[] args) {
     th1 t1 = new th1();
     th2 t2 = new th2();
     //--------------------------------------
     //prob3
     t1.setPriority(10);
        System.out.println(t1.getPriority());
     t2.setPriority(5);
        System.out.println(t2.getPriority());
     //--------------------------------------
     //prob4
        System.out.println(t1.getState());
        System.out.println(t2.getState());
     //--------------------------------------
     //prob5
        System.out.println(Thread.currentThread().getState());// Reference to current thread.
     //--------------------------------------
     t1.start();
     t2.start();


    }
}
