package overloading_overriding_hiding;

import javax.swing.plaf.IconUIResource;

class whatsapp1{
    void sent(){
        System.out.println("single tick");
    }
}

class whatsapp2 extends whatsapp1{
    void sent(){
        super.sent();
        System.out.println("double tick");
    }
    void voicenote(){
        System.out.println("voice msg");
    }
}

class whatsapp3 extends whatsapp2{
    void sent(){
        super.sent();
        System.out.println("double blue tick");
    }
    void video_call(){
        System.out.println("normal video call");
    }
}

class whatsapp4 extends whatsapp3{
    void videocall(){
        System.out.println("HD video call");
    }
}
public class overriding_Whatsapp {
    public static void main(String[] args) {
        whatsapp4 w4 = new whatsapp4();
        w4.sent();
        w4.voicenote();
        w4.video_call();
        w4.videocall();
    }
}
