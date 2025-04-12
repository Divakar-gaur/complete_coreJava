package constructor;

public class basic1 {
    int i;
    int j;

    basic1(int a,int b){
        i=a;
        j=b;
    }

    public void display(){
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {

        basic1 a1=new basic1(10,20);
        a1.display();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;");
        basic1 a2=new basic1(30,40);
        a2.display();
    }
}
