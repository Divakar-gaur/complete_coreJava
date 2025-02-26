package constructor;

public class rectangle {
    int length;
    int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display(){
        System.out.println(length);
        System.out.println(breadth);
    }

    public static void main(String[] args) {
        rectangle r1= new rectangle(4,5);
        r1.display();
        System.out.println("'''''''''''''''''''''''''");
        rectangle r2= new rectangle(9,8);
        r1.display();
    }
}
