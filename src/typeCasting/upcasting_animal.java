package typeCasting;

//PROCESS OF CREATING OBJECT FOR A SUBCLASS AND STORING REFERENCE INTO PARENT TYPE IS CALLED UPCASTING.

class animal{

}
class dog extends animal{

}
class babydog extends dog{

}
class cat extends animal{

}
public class upcasting_animal {
    public static animal m1(){
        return new animal();
//        return new babydog();    upcasting babydog to animal
//        return new dog();        upcasting dog to animal
//        return new cat();        upcasting cat to animal
    }
    public static dog m2(){
         return new dog();
//         return new cat();              //CTE  (NO IS-A RELATION)
//         return new animal();           //CTE
//         return new babydog();         //CTS   (upcasting babydog to animal)

    }

    public static void main(String[] args) {

        //eat(new animal());    //CTE
        //eat(new cat());       //CTE no is a relation
        eat(new babydog());

    }
    public static void eat(dog a){
        System.out.println("eating");
    }
}
