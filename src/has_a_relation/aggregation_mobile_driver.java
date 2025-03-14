package has_a_relation;

// one object can exist without another EX- CAR CAN EXIST WITHOUT MUSIC PLAYER

class sim{
    String name;
    long num;

    public sim(String name , long num){
        this.name=name;
        this.num=num;
    }

    public void display(){
        System.out.println("sim card name : "+name);
        System.out.println("sim card number : "+num);
    }
}

class mobile{
    String Mobname;
    int ram;
    int rom;
    String colour;
    sim s;

    public mobile(String mobname, int ram, int rom, String colour) {
        Mobname = mobname;
        this.ram = ram;
        this.rom = rom;
        this.colour = colour;

    }
    public void insert_sim(sim s){
        this.s=s;

    }
    public void displayMob(){
        System.out.println(Mobname);
        System.out.println(ram);
        System.out.println(rom);
        System.out.println(colour);

        if(s!=null) s.display();
        else System.out.println("no sim card");
    }

}

public class aggregation_mobile_driver {
    public static void main(String[] args) {
        mobile m1=new mobile("oppo",4,128,"blue");
        m1.displayMob();
        System.out.println("....................");
        m1.insert_sim(new sim("airtel",987653456));

        m1.displayMob();
    }
}
