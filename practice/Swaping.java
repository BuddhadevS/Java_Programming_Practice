public class Swaping {
    public static void main(String[] args) {
        int p = 100;
        int b = 200;
        p = p + b;
        b = p - b;
        p = p - b;
        System.out.println("After swaping p value is" + " " + p);
        System.out.println("After swaping b value is" + " " + b);

    }
}
