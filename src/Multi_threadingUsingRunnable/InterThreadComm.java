package Multi_threadingUsingRunnable;

class Account{
    int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public synchronized void withdraw(int amount){
        if(amount>bal){
            try{
                System.out.println("less bal");
            }catch (Exception e){

            }
        }
        bal-=amount;
        System.out.println(amount+" withdraw done...");
        System.out.println(bal + " available balance...");
    }

    public synchronized void deposit(int amount){
        System.out.println("filling account");
        bal+=amount;
        notify();
        System.out.println("deposit successful...");
    }
}
public class InterThreadComm {
    public static void main(String[] args) {
        Account a=new Account(5000);
        new Thread(){
            public void run(){
                a.withdraw(7000);
            }
        }.start();

        new Thread(){
            public void run(){
                a.deposit(5000);
            }
        }.start();
    }
}
