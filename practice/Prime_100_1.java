/**
 * Prime_100_1
 */
public class Prime_100_1 {

    public static void main(String[] args) {
        for (int i = 100; i >= 2; i--) {
            // System.out.println(i);
            int no = i;
            boolean flag = true;
            for (int j = 2; j < no; j++) {
                if (no % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("The no " + no + "  " + "is a prime no");
            }
        }
    }
}