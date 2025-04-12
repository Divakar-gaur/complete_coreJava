package Multi_threadingUsingRunnable;

//some mistake is there

class A{
    public synchronized void m1(String s){
        for(int i=1;i<=5;i++) {
            System.out.println("m1() is executed - : " + s);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}

class TH extends Thread{
    A a;
    String s;

    public TH(A a, String s) {
        this.a = a;
        this.s = s;
    }
    @Override
    public void run(){
        a.m1("divakar");
    }
}

public class T4 {
    public static void main(String[] args) {
        A a=new A();
        TH t1=new TH(a,"T1");
        TH t2=new TH(a,"T2");
        t1.start();
        t2.start();
    }
}
