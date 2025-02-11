package methods;

public class overloading_main {
    public static void main(String[] args) {
        System.out.println("this is main method");
        main();
        overloading_main x=new overloading_main();
        x.main(45);
        x.main(10+15);
        main(13,23);
    }
    public static void main() {
        System.out.println("only main without string args");
    }
    public void main(int i){
        System.out.println("main(int i"+i);
    }
    public static int main(int i,int j){
        System.out.println("main with 2 integers"+i+j);
        return i+j;
    }
}
