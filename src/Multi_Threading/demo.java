package Multi_Threading;

public class demo {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.setPriority(9);
        System.out.println(t1.getPriority());
//        t1.setPriority(12); priority can be possible upto 10 only.
        System.out.println(Thread.currentThread().getPriority());
        t1.start();
        for (int i=1;i<=10;i++){
            System.out.println("main thread " + i);
        }
    }
}


