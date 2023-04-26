package com.company;

import java.util.Arrays;
import java.util.Scanner;
class library {
    String[]books;
    int no_of_books;
    library(){
        this.no_of_books=0;
        this.books = new String[100];
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added.");
    }
    void showavailablebooks(){
        System.out.println("Available books are:");
        for (String book:this.books) {
            if(book == null){
                continue;
            }

            System.out.println("* "+book);
        }
    }
    void issuebook(String book) {
        for (int i = 0; i < this.books.length; i++) {
                if (this.books[i] == book) {
                    System.out.println("The " + book + " has been issued.");
                    this.books[i] = null;
                    return;
                }
        }
        System.out.println("This book does not exist.");
    }
    void returnbook(String book){
        this.books[no_of_books]= book;
        System.out.println(book +" has been returned.");
    }
}
    public class Exercise_4_51 {
        public static void main(String[] args) {
            // you have to implement a library using java class library.
            // methods: addBook, issueBook, returnBook, showAvailableBook.
            // properties: Array to store the available books.
            // properties: array to store the issued books.
            library l = new library();
            l.addbook("13 reasons why");
            l.addbook("rich and poor dad");
            l.addbook("spartans");
            l.addbook("C++");
            System.out.println("----------------------------------------------------------------------------------------");
            l.issuebook("C++");
            System.out.println("----------------------------------------------------------------------------------------");
            l.returnbook("C++");
            System.out.println("----------------------------------------------------------------------------------------");
            l.showavailablebooks();
        }
    }
