package SingleTonClass;

public class threater {
    int seats=50;
    static private threater t;
    private threater (){};

    public static threater getInstance(){
        if (t==null){
            t=new threater();
            return t;
        }
        else return t;
    }
    public void bookTicket(int n){
        if(seats>=n){
            System.out.println(n+" seats booked");
            seats-=n;
        }
        else System.out.println(n+" seats not available");
    }
}
