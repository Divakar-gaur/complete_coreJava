package JAVA_8_FEATURES;

import java.util.function.Predicate;
import java.util.function.Function;

public class FunctionEX2 {
    public static void main(String[] args) {
        Emp e1=new Emp("dhoni",43,100000);
        Emp e2=new Emp("kl",34,10000);
        Emp e3=new Emp("virat",29,9000);
        Emp e4=new Emp("hardik",23,6000);
        Emp e5=new Emp("mr.360",37,5000);

        Emp [] e={e1,e2,e3,e4,e5};

        Function<Emp,Integer> fn = i -> {
            int bonus;
            if (i.sal < 10000) {
                bonus = (int) (i.sal * 20) / 100;
                return bonus;
            } else if (i.sal >= 10000 && i.sal < 100000) {
                bonus = (int) (i.sal * 10) / 100;
                return bonus;
            } else {
                bonus = (int) (i.sal * 5) / 100;
                return bonus;

            }
        };
//        Predicate<Integer> p=i->i>2000;
        for(Emp em:e){
            int b=fn.apply(em);
//            if(p.test(b)) {
//                System.out.println(em);
//                System.out.println("bonus = "+b);
//                System.out.println("----------------");
//            }
            System.out.println(b);



        }

    }
}
