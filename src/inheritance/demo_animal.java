package inheritance;

class animal{
    void eat(){
        System.out.println("eating");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}

class babydog extends dog{
    void weep(){
        System.out.println("weeping");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("meowwww");
    }
}

public class demo_animal {
    public static void main(String[] args) {
        animal a=new animal();
        a.eat();
        //a.bark();      //CTE

        dog d=new dog();
        d.eat();
        d.bark();
        //d.weep();     //CTE

        babydog b=new babydog();
        b.eat();
        b.bark();
        b.weep();
        //b.sound();    //CTE

        cat c=new cat();
        c.eat();
        c.sound();
        //c.bark();    //CTE
        //c.weep();    //CTE
    }
}
