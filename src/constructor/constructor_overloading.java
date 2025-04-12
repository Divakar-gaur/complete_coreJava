package constructor;


// creating multiple constructors in a class with diff arguments is called constructor overloading.


public class constructor_overloading {
    constructor_overloading(){
        System.out.println("no arg constructor");
    }
    constructor_overloading(int n){
        System.out.println("constructor_overloading(int n)");
    }
    constructor_overloading(int i , int j){
        System.out.println("constructor_overloading(int i, int j)");
    }

    public static void main(String[] args) {
        new constructor_overloading();
        new constructor_overloading(10);
        new constructor_overloading(20,30);
    }

}
