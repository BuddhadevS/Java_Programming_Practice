
public class Method_with_returntype {

    int sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        Method_with_returntype r = new Method_with_returntype();
        r.sum(100, 200);

    }
}
