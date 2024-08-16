public class Prime_10 {

    void pri() {
        for (int j = 2; j < 100; j++) {

            boolean flag = true;
            int no = j;
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("The no is prime: " + j);

            }

        }

    }

    public static void main(String[] args) {
        Prime_10 prime_10 = new Prime_10();
        prime_10.pri();

    }
}
