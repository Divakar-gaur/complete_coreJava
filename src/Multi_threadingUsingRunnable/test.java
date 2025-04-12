package Multi_threadingUsingRunnable;

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("child thread " + i);
            try{
                Thread.sleep(600);
            }catch (InterruptedException e){

            }
        }
    }
}
public class test {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        t1.start();
        for(int i=1;i<=5;i++) {
            System.out.println("main thread " + i);
            Thread.sleep(600);
        }
    }
}
