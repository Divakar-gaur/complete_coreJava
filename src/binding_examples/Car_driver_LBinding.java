package binding_examples;

class car{
    void st(){

    }
    void acc(){

    }
    void stop(){

    }
}

class bmw extends car{
    void st(){
        System.out.println("bmw started");
    }
    void acc(){
        System.out.println("bmw going");
    }
    void stop(){
        System.out.println("bmw stop");
    }
}

class benz extends car{
    void st(){
        System.out.println("benz started");
    }
    void acc(){
        System.out.println("benz going");
    }
    void stop(){
        System.out.println("benz stop");
    }
}

class driver{
    static void drive (car c){
        c.st();
        c.acc();
        c.stop();
    }
}

public class Car_driver_LBinding {
    public static void main(String[] args) {
        driver.drive(new bmw());
        System.out.println();
        System.out.println("......late binding......");
        System.out.println();
        driver.drive(new benz());
    }
}
