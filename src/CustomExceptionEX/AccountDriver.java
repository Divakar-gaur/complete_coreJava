package CustomExceptionEX;

public class AccountDriver {
    public static void main(String[] args) {
        Account a=new Account();
        try{
            a.withdraw(10700);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("handled");
        }
    }
}
