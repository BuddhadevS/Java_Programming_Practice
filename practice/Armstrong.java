public class Armstrong {
    public static void main(String[] args) {
        int arm = 1634;
        int no = arm;
        int sum = 0;
        while (no != 0) {
            int rem = no % 10;
            sum = sum + rem * rem * rem * rem;
            no = no / 10;
        }
        if (sum == arm) {
            System.out.println("The no is a armstrong");
        } else {
            System.out.println("The no is not a armstrong");
        }
    }
}
