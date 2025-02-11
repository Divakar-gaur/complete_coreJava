package patterns;
class employee {
    String name;
    int age;
    int id;
    long mob;

    public employee (String name, int age, int id, long mob){
        this.name=name;
        this.age=age;
        this.id=id;
        this.mob=mob;
    }

    @Override
    public boolean equals(Object o) {
        employee e=(employee)o;
        return this.name.equals(e.name) && this.age==e.age && this.id == e.id && this.mob==e.mob;
    }
}
public class demo {
    public static void main(String[] args) {
        employee e1 = new employee("abc",23,12,987654);
        employee e2 = new employee("abc",23,12,987654);
        System.out.println();
    }
}
