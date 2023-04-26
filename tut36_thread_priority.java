package com.company;


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        //System.out.println(this.getName());
        while(true){
            System.out.println(this.getName());
        }
    }
}

public class ThreadPriorities_74 {
    public static void main(String[] args) {
        // Ready Queue: T1, T2, T3, T4 ----> Maintained by JVM.
        MyThr T1 = new MyThr("sam1");
        MyThr T2 = new MyThr("sam2");
        MyThr T3 = new MyThr("sam3");
        MyThr T4 = new MyThr("sam4");
        T1.setPriority(10);
        T2.setPriority(7);
        T3.setPriority(5);
        T4.setPriority(1);
        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
}
