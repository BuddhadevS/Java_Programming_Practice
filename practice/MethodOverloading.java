
/**
 * User
 */
class User {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(Long a, Long b) {
        System.out.println("Hello this is user 2");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        User.add(10, 20);
        User.add(125452, 548852);
    }
}
