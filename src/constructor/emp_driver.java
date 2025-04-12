package constructor;

class emp{
    String name;
    int age;
    int id;
    long mob;
    int sal;

    emp(){

    }

    public emp(String name, int age, long mob, int id, int sal) {
        this.name = name;
        this.age = age;
        this.mob = mob;
        this.id = id;
        this.sal = sal;
    }

    emp(emp e) {
        this.name = e.name;
        this.age = e.age;
        this.id = e.id;
        this.mob = e.mob;
        this.sal = e.sal;
    }



    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
        System.out.println(mob);
        System.out.println(sal);

    }

}

public class emp_driver {
    public static void main(String[] args) {
        emp e1=new emp();
        emp e2=new emp("tara",25,01,98765434,5500);
        emp e3=new emp(e1);
        emp e4=new emp(e2);
        e1.display();
        e2.display();
        e3.display();
        e4.display();

    }
}
