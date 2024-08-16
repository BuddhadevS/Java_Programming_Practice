public class Star_23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int p = i; p >= 1; p--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int f = 1; f <= 4; f++) {
            for (int t = 1; t <= f; t++) {
                System.out.print(" ");
            }

            for (int o = 3; o >= f; o--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
