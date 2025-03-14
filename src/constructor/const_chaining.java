package constructor;

class phone{
    String name;
    String colour;

    public phone(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}

class Smart_phone extends phone{
    int ram;
    int rom;
    int pixel;

    public Smart_phone(String name, String colour,int ram,int rom, int pixel) {

        super(name, colour);
        this.ram=ram;
        this.rom=rom;
        this.pixel = pixel;
    }
    public void display(){
        System.out.println(name);
        System.out.println(colour);
        System.out.println(ram);
        System.out.println(rom);
        System.out.println(pixel);
    }
}

public class const_chaining {
    public static void main(String[] args) {
        Smart_phone s=new Smart_phone("oppo","black",4,128,48);
        s.display();
    }
}
