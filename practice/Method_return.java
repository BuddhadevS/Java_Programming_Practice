
public class Method_return {

    int add() {

        int no = 17;
        boolean flag = true;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                flag = false;
                break;

            }
        }
        if (flag == true) {
            System.out.println("No is a prime no");
        } else {
            System.out.println("No is not a prime no");
        }
        return no;

    }

    public static void main(String[] args) {
        Method_return method_return = new Method_return();
        method_return.add();
    }
}