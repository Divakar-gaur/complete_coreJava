package Multi_threadingUsingRunnable;


class T1 implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("child thread " + i);
        }
    }
}


public class demo {
    public static void main(String[] args) {
        T1 t1=new T1();  // new thread born
//        t1.start();   //  CTE
        Thread t=new Thread(t1);
        t.start();
    }
}



