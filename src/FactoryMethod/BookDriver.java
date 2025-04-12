package FactoryMethod;

public class BookDriver {
    public static void main(String[] args) {
        book b1=book.Create_book();
        b1.display();
    }
}
