package constructor;

public class student1 {
    String name;
    int age;
    int id;
    long mob;

    student1(){

    }
    student1(String name){
        this();
        this.name=name;
    }

    student1(String name, int age){
        this(name);
        this.age=age;
    }

    student1(String name,int age,int id){
        this(name,age);
        this.id=id;
    }

    student1(String name, int age, int id, long mob){
        this(name,age,id);
        this.mob=mob;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
        System.out.println(mob);
    }

    public static void main(String[] args) {
        student1 s=new student1("tara",25,1,98763456);
        s.display();
    }
}
