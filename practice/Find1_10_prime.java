public class Find1_10_prime {
    public static void main(String[] args) {
        for (int j = 2; j <= 10; j++) {
            int no = j;
            // System.out.println(no);

            boolean flag = true;
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    flag = false;
                    break;

                }

            }
            if (flag == true) {
                System.out.println("The no prime are" + no);
            }

        }
    }
}
