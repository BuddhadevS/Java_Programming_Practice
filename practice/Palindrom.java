public class Palindrom {
    public static void main(String[] args) {
        int pal = 171;
        int no = pal;
        int rev = 0;
        while (no != 0) {
            int rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }

        if (rev == pal) {
            System.out.println("No is a palindrom no");
        } else {
            System.out.println("No is not  a palindrom no");
        }

    }
}
