package com.company;


//int a = 7;  // a --> parameters, 7 --> arguments

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int a = 0;
        while (a<1000){
            System.out.println("------------------------");
            System.out.println("------------------------");
            a++;
        }
    }
}
public class JavaThreadUsingThreadClass_70 {
    public static void main(String[] args) {
        MyThread1 MT1 = new MyThread1();
        MyThread2 MT2 = new MyThread2();
        MT1.start();
        MT2.start();

    }
}
