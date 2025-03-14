package overloading_overriding_hiding;

class bank{
    int ROI(){
        return 0;
    }
}

class SBI extends bank{
    protected int ROI(){
        return 10;
    }
}

class ICICI extends bank{
    protected int ROI(){
        return 11;
    }
}

class AXIS extends bank{
    protected int ROI(){
        return 12;
    }
}

public class overriding_Ex_Bank_driver {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a= new AXIS();
        System.out.println(s.ROI());
        System.out.println(i.ROI());
        System.out.println(a.ROI());
    }
}
