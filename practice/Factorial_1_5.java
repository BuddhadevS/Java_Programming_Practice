/**
 * Factorial_1_5
 */
public class Factorial_1_5 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
        }
        int x = sum;
        int fact = 1;
        for (int j = x; j >= 1; j--) {
            fact = fact * j;
        }
        System.out.println(fact);

    }
}
