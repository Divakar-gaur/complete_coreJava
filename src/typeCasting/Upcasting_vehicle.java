package typeCasting;

// INHERITANCE IS MANDATORY FOR UPCASTING AND DOWNCASTING.
//USING UPCAST REFERENCE VARIABLE WE CANT ACCESS SUB CLASS PROPERTIES.

class vehicle{

}

class bmw extends vehicle{

}

class benz extends vehicle{

}

class audi extends vehicle{

}

public class Upcasting_vehicle {
    public static void main(String[] args) {
        drive(new audi());
        drive(new benz());
        drive(new bmw());
    }

    public static void drive(vehicle v){
        System.out.println("driving");
    }
}
