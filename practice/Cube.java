public class Cube {
    public static void main(String[] args) {
        int n = 501; // 5+0+1 = 6;
        int no = n;
        int sum = 0;
        while (no != 0) {
            int rem = no % 10;
            sum = sum + rem;
            no = no / 10;

        }
        System.out.println(sum);

       // if (sum == n) {
        //     System.out.println("The given number sum is currect");
        // } else {
        //     System.out.println("The given number sum is not-currect");

        // }

    }
}
