package JAVA_8_FEATURES;

public class Emp {
    String name;
    int age;
    int sal;


    public Emp(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" + "name='" + name + '\'' + ", age=" + age + ", sal=" + sal + '}';
    }
}
