
class Whatsapp {
    void send(int a, int b) {
        System.out.println("This is addition " + (a + b));
    }
}

class Insta extends Whatsapp {

    void send() {
        System.out.println("This is instagram");
        super.send(10, 20);
    }
}

public class MethodOverridding {
    public static void main(String[] args) {
        Whatsapp w = new Whatsapp();
        w.send(10, 20);
    }
}
