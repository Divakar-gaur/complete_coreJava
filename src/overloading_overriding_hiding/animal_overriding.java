package overloading_overriding_hiding;

// OVERRIDING IS ONLY POSSIBLE IN NON-STATIC METHODS.

class animal{
    void sound(){
        System.out.println("animal sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog barking");
    }
}

class babydog extends dog {
    void sound(){
        System.out.println("babydog weeping");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("cat meowwwww");
    }
}

public class animal_overriding {
    public static void main(String[] args) {
        babydog b=new babydog();
        //animal b=new babydog();        O/P = babydog weeping
        b.sound();
    }
}
