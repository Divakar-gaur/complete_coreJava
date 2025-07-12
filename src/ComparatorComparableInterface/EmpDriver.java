package ComparatorComparableInterface;

import java.util.Arrays;

class Emp implements Comparable{
    String name;
    int age;
    int id;


    public Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + '}';
    }

    @Override
    public int compareTo(Object o){
        Emp e=(Emp) o;
        if(this.age>e.age) return 1;
        else if (this.age<e.age) return -1;
        return 0;
    }


}
public class EmpDriver {
    public static void main(String[] args) {
        Emp e1=new Emp("AMAN",24,101);
        Emp e2=new Emp("Vinay",22,105);
        Emp e3=new Emp("Bunny",26,103);
        Emp e4=new Emp("Tara",29,109);
        Emp e5=new Emp("Sumit",21,102);

        Emp [] e={e1,e2,e3,e4,e5};
        Arrays.sort(e);
        for(Emp emp : e )
            System.out.println(emp);
    }
}
