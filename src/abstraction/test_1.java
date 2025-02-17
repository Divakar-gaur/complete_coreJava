package abstraction;

abstract class shape{
    String colour;
    public shape(String colour){
        this.colour=colour;
    }
    abstract public void GetArea();
    abstract public void display();
}
class rectangle extends  shape{
    int length;
    int breadth;
    public rectangle(String colour,int length,int breadth){
        super(colour);
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void GetArea() {
        System.out.println("area of rectangle is "+length*breadth);
    }

    @Override
    public void display() {
        System.out.println("length= "+ length);
        System.out.println("breadth= "+ breadth);

    }
}
class circle extends  shape {
    int radius;

    public circle(String colour, int radius) {
        super(colour);
        this.radius=radius;
    }

    @Override
    public void GetArea() {
        int res=(int)(3.14*radius*radius);
        System.out.println("area of circle is "+res);
    }

    @Override
    public void display() {
        System.out.println("radius= " + radius);
    }
}
public class test_1 {
    public static void main(String[] args) {
        shape s=new rectangle("red",12,6);
        s.GetArea();
        s.display();
        s=new circle("pink",5);
        s.GetArea();
        s.display();
    }
}
