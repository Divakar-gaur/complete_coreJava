package constructor;

public class basic2 {
    int i;
    int j;
    int k;

    basic2() {

    }
    basic2(int i){
        this.i=i;
    }
    basic2(int i, int j){
        this.i=i;
        this.j=j;
    }
    basic2(int i, int j, int k){
        this.i=i;
        this.j=j;
        this.k=k;
    }

    public void display(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    public static void main(String[] args) {
        basic2 b=new basic2();
        b.display();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;");
        basic2 b1=new basic2(10);
        b1.display();
        System.out.println(":::::::::::::::::::::");
        basic2 b2=new basic2(10,20);
        b2.display();
        System.out.println(",,,,,,,,,,,,,,,,,,,,,");
        basic2 b3=new basic2(10,20,30);
        b3.display();
    }
}
