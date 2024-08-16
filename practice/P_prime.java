/**
 * P_prime
 */
public class P_prime {

    public static void main(String[] args) {
        int no = 3;
        boolean flag = true;
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("The given no is prime");
        } else {
            System.out.println("The given no is not a prime");
        }
    }
}