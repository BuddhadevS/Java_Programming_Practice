public class Star_14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (int p = 3; p >= 1; p--) {
            for (int q = p; q >= 1; q--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
