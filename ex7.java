package com.company;

import java.util.*;

class AccessPortal{
    Scanner s = new Scanner(System.in);
    LinkedList<String> username = new LinkedList<String>();
    LinkedList<String> password = new LinkedList<String>();
    public void SignUp(){
        System.out.println("SIGN UP HERE FOR FREE.....");
        System.out.print("Create username: ");
        String userup = s.next();
        System.out.print("Create password: ");
        String passup = s.next();
        System.out.print("Confirm password: ");
        String confirm = s.next();
        if(confirm.equals(passup)){
            username.add(userup);
            password.add(passup);
            System.out.println("Congratulations! You are now added to the database.");
        }
    }
    public void SignIn(){
        System.out.println("SIGN IN HERE FOR FREE.....");
        System.out.print("Enter userame: ");
        String userin = s.next();
        System.out.print("Enter password: ");
        String passin = s.next();
        if(username.contains(userin) && password.contains(passin)){
            System.out.println("Access granted to "+userin);
        }
        else{
            System.out.println("Access denied.");
        }
    }
}

public class PorblemInJava {
    public static void main(String[] args) {
//        int mod = 0;
//     for(int i = 0; i<=100; i++){
//         for(int j = 0; j<=i; j++){
//             mod = j;
//             System.out.print(mod+" ");
//         }
//         System.out.println();
//     }

        AccessPortal ap = new AccessPortal();
        ap.SignUp();
        ap.SignIn();
    }
}
