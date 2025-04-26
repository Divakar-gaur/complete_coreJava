package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

class Emp {
    String name;
    int age;
    char ch;


    public Emp(String name, int age, char ch) {
        this.name = name;
        this.age = age;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Emp{" + "name='" + name + '\'' + ", age=" + age + ", ch=" + ch + '}';
    }
}


public class CountingMaleFemaleEmp {
    public static void main(String[] args) {
        Emp e1 = new Emp("AMAN", 24, 'm');
        Emp e2 = new Emp("Vinay", 22, 'f');
        Emp e3 = new Emp("Bunny", 26, 'f');
        Emp e4 = new Emp("Tara", 29, 'f');
        Emp e5 = new Emp("Sumit", 21, 'm');

        Emp[] e = {e1, e2, e3, e4, e5};
        List<Emp> l = Arrays.asList(e);
        Long lg = l.stream().filter(i -> i.ch == 'f').count();
        System.out.println("female count is " + lg);
        System.out.println("male count is "+ (e.length-lg));
    }
}
