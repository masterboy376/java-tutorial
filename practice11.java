package com.company;


//prob1
abstract class pen{
    abstract void write(double decrement);
    abstract void refill(int increment);
}
//----------------------------------------------------------------------------------------------------------------------
//prob2
class Fountainpen extends pen{
    @Override
    public void write(double decrement){
        System.out.println("pen is dying at the rate of "+ decrement+"mm/s");
    }
    @Override
    public void refill( int increment){
        System.out.println("pen is getting refilled at the rate of "+ increment +"mm/s");
    }
    void changenib(){
        System.out.println("changing nib...");
    }
}
//----------------------------------------------------------------------------------------------------------------------
//prob3
interface Basicanimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){System.out.println(" jumping");}
    void bite(){System.out.println("biting");}
}
class Human extends Monkey implements Basicanimal{
    @Override
    public void eat() {
        System.out.println("eating");
    }
    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
    void speak(){
        System.out.println("Hello...");
    }
}
//----------------------------------------------------------------------------------------------------------------------
//prob4
interface TVRemote{
    void poweron();
    void poweroff();
    void channel(int channelno);
}
interface SmartTVRemote extends TVRemote{
    void androidmode();
    void connectwifi(String networkname);
}
//----------------------------------------------------------------------------------------------------------------------
//prob6
class SmartTV implements SmartTVRemote{
    @Override
    public void poweron() {
        System.out.println("Turning on the TV...");
    }

    @Override
    public void poweroff() {
        System.out.println("turning off the TV...");
    }

    @Override
    public void channel(int channelno) {
        System.out.println("playing the channel with channel number "+channelno);
    }

    @Override
    public void androidmode() {
        System.out.println("Switching to android mode.");
    }

    @Override
    public void connectwifi(String networkname) {
        System.out.println("forming up the connection with "+networkname);
    }
}
//----------------------------------------------------------------------------------------------------------------------



public class Practiceset_11 {
    public static void main(String[] args) {
      //prob2
      Fountainpen pen = new Fountainpen();
      pen.changenib();
      pen.refill(10);
      pen.write(0.9);

      //----------------------------------------------------------------------------------------------------------------
        //prob5
        //Basicanimal b = new Basicanimal();// error
        Basicanimal b = new Human();
        b.eat();
        b.sleep();
        Monkey m = new Human();
        m.bite();
        m.jump();

        //--------------------------------------------------------------------------------------------------------------
        //prob6
        SmartTV s = new SmartTV();
        s.poweron();
        s.channel(7);
        s.connectwifi("sam network");
        s.androidmode();
        s.poweroff();

    }
}
