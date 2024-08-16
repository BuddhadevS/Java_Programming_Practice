public class Star_18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }

            for (int p = 1; p <= i; p++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int k = 1; k <= 4; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(" ");
            }

            for (int r = 3; r >= k; r--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
