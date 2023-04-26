package com.company;

interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){// private method
        System.out.println(" good morning ");
    }
    default  void video4k(){// default method
        greet();// private method
        System.out.println("recording in 4k");
    }
}

interface mywifi{
    String[]getnetwork();
    void connecttonetwork(String network);
}

class mycellphone{
    void callnumber(int num) {
        System.out.println("calling " + num);
    }
    void pickcall() {
        System.out.println("picking...");
    }
}

class mysmartphone extends mycellphone implements mycamera, mywifi{
    public void takesnap(){
        System.out.println("Taking snap");
    }

    public void recordvideo(){
        System.out.println("zzzzzzzzzzz....");
    }

    //@Override
    //public void video4k(){ System.out.println("recording in 4k and snap"); } // optional

    public String[]getnetwork(){
        System.out.println("getting list of networks");
        String[] networklist = {"sam","jam","hum"};
        return networklist;
    }

    public void connecttonetwork( String network){
        System.out.println("connecting to "+network);
    }
}
public class MultipleInheritance_55 {
    public static void main(String[] args) {
      mysmartphone ms = new mysmartphone();
      String[] arr = ms.getnetwork();
        for (String item:arr){
            System.out.println(item);
        }

        ms.video4k();
        //ms.greet(); // error

    }
}
