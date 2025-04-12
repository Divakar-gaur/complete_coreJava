package constructor;

public class box {
    int length;
    int breadth;
    int height;
    box(){

    }
    box(int n){
        length=n;
        breadth=n;
        height=n;
    }

    box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void display(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }

    public static void main(String[] args) {
        box b1=new box();
        b1.display();
        System.out.println("_________________");
        box b2=new box(5);
        b2.display();
        System.out.println("==================");
        box b3=new box(5,6,7);
        b3.display();
    }
}
