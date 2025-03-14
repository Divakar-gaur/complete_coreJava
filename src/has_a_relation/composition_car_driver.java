package has_a_relation;

//   ONE OBJECT CAN'T EXIST WITHOUT ANOTHER.
// CAN BE ACHIEVED BY PLACING ONE CLASS REFERENCE VARIABLE IN ANOTHER.

class engine{
    int cc;
    String type;

    public engine(int cc, String type) {
        this.cc = cc;
        this.type = type;
    }

    public void display(){
        System.out.println("power is : " + cc);
        System.out.println("fuel is : " + type);

    }
}

class car{
    String brand;
    int num;
    String colour;
    engine e;

    public car(String brand, int num, String colour, engine e) {
        this.brand = brand;
        this.num = num;
        this.colour = colour;
        this.e = e;
    }

    public void display_car(){
        System.out.println(brand);
        System.out.println(num);
        System.out.println(colour);
        e.display();


    }
}
public class composition_car_driver {
    public static void main(String[] args) {
        car c1=new car("BMW",1234,"BLACK",new engine(5000,"CNG"));
        c1.display_car();
        c1.e.type="diesel";
        System.out.println("----------------");
        c1.display_car();
    }
}
