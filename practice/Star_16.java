public class Star_16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int p = 3; p >= i; p--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
