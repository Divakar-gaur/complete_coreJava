package JAVA_8_FEATURES;

import java.util.function.Predicate;

public class PredicateEX2 {
    public static void main(String[] args) {
        Emp e1=new Emp("dhoni",43,100000);
        Emp e2=new Emp("kl",34,10000);
        Emp e3=new Emp("virat",29,9000);
        Emp e4=new Emp("hardik",23,6000);
        Emp e5=new Emp("mr.360",37,5000);

        Emp [] e={e1,e2,e3,e4,e5};

        Predicate<Emp> p=Emp->Emp.sal<10000;
        for (Emp em:e){
            if(p.test(em))
                System.out.println(em);
        }
    }
}
