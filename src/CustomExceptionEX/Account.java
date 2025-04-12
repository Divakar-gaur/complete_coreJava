package CustomExceptionEX;

public class Account {
    int bal=3000;
    public void withdraw (int amount) throws InsufficientBalException{
        if(amount>bal){
            throw new InsufficientBalException();
        }
        bal=bal-amount;
        System.out.println("withdraw successful");
    }
}
