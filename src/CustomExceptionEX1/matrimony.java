package CustomExceptionEX1;

class matrimony{
    public static void main(String[] args) {
        int age=21;
        if(age>=25 && age <=33)
            System.out.println("you are eligible");
        else {
            AgeInvalidException a=new AgeInvalidException();
            throw a;
        }
    }

}