package Multi_Threading;

class Mythread extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("child thread " + i);
        }
    }
}


public class test {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
        for (int i=1;i<=5;i++){
            System.out.println("main thread " + i);
        }
    }
}
