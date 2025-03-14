package final_keyword;

public class demo {
    final static int i=20;
    final int j;

    demo(int j){
        this.j=j;
    }

    public static void main(String[] args) {
        demo d1=new demo(10);
        demo d2=new demo(30);
        ///d1.j=50;              //CTE
        System.out.println(i);
        System.out.println(d1.j);
        System.out.println(d2.j);

    }
}


// final method/variable cant be overridden but overridden method in subclass can be made final.