package SingleTonClass;

public class book_my_show {
    public static void main(String[] args) {
        threater t1 = threater.getInstance();
        t1.bookTicket(15);
        threater t2 = threater.getInstance();
        t2.bookTicket(35);
        threater t3 = threater.getInstance();
        t3.bookTicket(2);
    }
}
