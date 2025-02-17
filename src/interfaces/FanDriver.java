package interfaces;

interface regulator{
    void IncreaseSpeed();
    void DecreaseSpeed();
}
interface swich{
    void on();
    void off();
}
class fan implements regulator,swich{
    public void IncreaseSpeed(){
        System.out.println("speed increased");
    }
    public void DecreaseSpeed(){
        System.out.println("speed decreased");
    }
    public void on(){
        System.out.println("fan is on");
    }
    public void off(){
        System.out.println("fan is off");
    }
}
public class FanDriver {
    public static void main(String[] args) {
        regulator r=new fan();
        r.IncreaseSpeed();
        r.DecreaseSpeed();
        //r.on();   //CTE
        //r.off();   //CTE
        swich s=new fan();
        s.on();
        s.off();
        //s.IncreaseSpeed();   //CTE
        //s.DecreaseSpeed();   //CTE
    }
}
