package com.company;

class phone{
    public void time(){
        System.out.println("7 am");
    }
        public void on(){
        System.out.println("turning on phone...");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("fuck you and you and youuu!");
    }
    @Override
    public void on() {
        System.out.println("turning on smartphone...");
    }
}

public class DynamicMethodDispatch_49 {
    public static void main(String[] args) {
        //phone obj = new phone();
        //smartphone smobj = new smartphone();
        //obj.name();

        phone obj = new smartphone();// you can call smartphone a phone(by parent name). but vise versa in not true--->'new' show this object will work in run time.
        // smartphone obj = new phone();// not allowed XXXXX
        obj.on();//methed is called from smartphone.(sub class)
        obj.time();//both class have this method due to inheritance.
        // obj.music();//not allowed becoz super class donot have this method. XXXXX

    }
}
