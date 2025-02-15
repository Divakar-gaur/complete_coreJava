package abstraction;
import java.util.Scanner;
abstract class bank {
    abstract int ROI();
}
class SBI extends bank{
    @Override
    int ROI() {
        return 10;
    }
}
class AXIS extends bank{
    @Override
    int ROI() {
        return 11;
    }
}
class HDFC extends bank{
    @Override
    int ROI() {
        return 12;
    }
}
class user{
    static bank getbank(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.SBI\n2.AXIS\n3.HDFC");
        int n=sc.nextInt();
        if(n==1) return new SBI();
        else if(n==2) return new AXIS();
        else if(n==3) return new HDFC();
        else {
            System.out.println("Invalid Input");
            return null;
        }
    }
}
public class BankDriver {
    public static void main(String[] args) {
        bank b=user.getbank();
        System.out.println(b.getClass().getSimpleName() + " Rate Of Interest : " + b.ROI());
    }
}
