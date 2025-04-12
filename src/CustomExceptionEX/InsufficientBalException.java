package CustomExceptionEX;

public class InsufficientBalException extends Exception{
    public InsufficientBalException(){
        System.out.println("less bal");
    }
}
