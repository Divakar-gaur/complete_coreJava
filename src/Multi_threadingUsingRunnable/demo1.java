package Multi_threadingUsingRunnable;

class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("MyThread1 : " + i);
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){

            }
        }
    }
}
public class demo1 {
    public static void main(String[] args) throws InterruptedException{
        MyThread1 t=new MyThread1();
        t.setDaemon(true);
        t.start();
        for(int i=1;i<=10;i++) {
            System.out.println("main thread : " + i);
            Thread.sleep(300);
//            if(i==5)
//                System.out.println(i/0);
        }
    }
}
