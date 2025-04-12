package Multi_threadingUsingRunnable;

class T2 extends Thread{
    public void run(){
        try{
            test1.t3.join();
        }catch (InterruptedException e){
        }
        for (int i=1;i<=5;i++){
            System.out.println("T2" + i);
        }
    }
}
class T3 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("T3 " + i);
        }
    }
}

public class test1 {
    static T3 t3;
    public static void main(String[] args) throws InterruptedException {
        T2 t2=new T2();
        t3=new T3();
        t2.start();
        t3.start();
        t2.join();
        for (int i=1;i<=5;i++){
            System.out.println("main " + i);
        }
    }
}
