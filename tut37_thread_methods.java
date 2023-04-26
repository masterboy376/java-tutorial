 package com.company;


class MyThr1 extends Thread{
   // public MyThr1(String name){
   //     super(name);
   // }
    int i =0;
    public void run(){
        //System.out.println(this.getName());
        while(true){
            System.out.println("YO");
            //-----1-----
            try {
                Thread.sleep(455);
            }
            catch (Exception e ){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThr2 extends Thread{
public void run(){
        //System.out.println(this.getName());
        while(true){
        System.out.println("hAPPY");
        }
    }
}

public class ThreadMethod_75 {
    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
        /*//----------------------------------------
        //-----1------
        //This method first execute t1 and then t2.
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        //----------------------------------------*/
        t2.start();

    }
}
