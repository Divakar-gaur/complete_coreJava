package constructor;

public class student {
    int id;
    int age;
    String name;
    long mobile;

    public student(int id, int age, String name, long mobile) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.mobile = mobile;
    }

    public student() {

    }

    public void display(){
        System.out.println(id);
        System.out.println(age);
        System.out.println(name);
        System.out.println(mobile);

    }

    public static void main(String[] args) {
        student s1=new student(01,23,"pranav",1234567890);
        s1.display();
        student s2=new student();
        s2.id=02;
        s2.age=11;
        s2.name="qwerty";
        s2.mobile=456456890;
        s2.display();
    }
}
