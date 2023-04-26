package com.company;

//---------
// -------------------------------------------------------------------------------------------------------------
class myemployee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getid() {
        return id;
    }
    public void setid(int n){
        id = n;
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class Ch_9_GettersAndSetters_40 {
    public static void main(String[] args) {
        myemployee sam = new myemployee();
       // sam.id=1234;
       // sam.name="Sambhav Kaushik"; ---->throws an error due to private access modifier.
        sam.setname("Sambhav ");
        System.out.println(sam.getname());
    }
}
