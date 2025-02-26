package FactoryMethod;

import java.util.Scanner;

public class book {
    String name;
    String author;
    double price;

    public void display(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }

    public book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public static book Create_book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter author");
        String author=sc.next();
        System.out.println("enter price");
        double price=sc.nextDouble();

        return new book(name,author,price);
    }
}
