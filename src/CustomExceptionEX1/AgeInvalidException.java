package CustomExceptionEX1;

public class AgeInvalidException extends RuntimeException{
    public AgeInvalidException(){
        System.out.println("you are not eligible to marry");
    }
}
