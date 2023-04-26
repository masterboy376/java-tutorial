 package com.company;


class T1 implements Runnable{
    public void run() {
        for(int i = 0; i<1000; i++){
        System.out.println("I am a thread not a threat1111111111111111.");
    }
    }
}
class T2 implements Runnable{
    public void run(){
        for(int i = 0; i<1000; i++) {
            System.out.println("I am a thread not a threat2222222222222222.");
        }
    }
}

public class JavaThreadUsingRunnableInterface_71 {
    public static void main(String[] args) {
        // method to start runnable interface.
        T1 bullet1 = new T1();
        Thread gun1 = new Thread(bullet1);

        T2 bullet2 = new T2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
