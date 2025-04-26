package JAVA_8_Method_and_Constructor_Reference;

interface getInt<T>{
    T get(String s,int a,int i);
}

class Emp{
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
        return "Emp {" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + "}";
    }
}

public class Const_Reference_using_Interface {
    public static void main(String[] args) {
        getInt<Emp> i=Emp::new;
        Emp e1=i.get("tara",24,1);

        System.out.println(e1);
    }
}
