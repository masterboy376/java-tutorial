package com.company;


class mainemployee{
    private int id;
    private String name;
    private int salary;
    //------------------------------------------------------------------------------------------------------------------
    //constructor---> work as function.--->constructor can be overloaded

    public mainemployee() {
        id = 45;
        name = " sam";
    }
    public mainemployee(String myname, int myid){// giving attributes
        id=myid;
        name= myname ;
    }
    public mainemployee(String myname){// giving attributes
        id=7;
        name= myname ;
    }
    public mainemployee(String myname, int n, int mysalary){// giving attributes
        id=n;
        name= myname ;
        salary=mysalary;
    }
    //------------------------------------------------------------------------------------------------------------------
    public String getname(){return name;}
    public void setname(String n){ name = n;}
    public int getid(){return id;}
    public void setid(int n){id = n;}
    public void setsalary(int n){salary = n;}
    public int getsalary(){return salary;}

}
public class ConstructorInJava_42 {
    public static void main(String[] args) {
        mainemployee sam =  new mainemployee("sambhav", 7,10000);
        System.out.println(sam.getname());
        System.out.println(sam.getid());
    }
}
