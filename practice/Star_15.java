public class Star_15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (int p = 3; p >= 1; p--) {
            for (int k = p; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
