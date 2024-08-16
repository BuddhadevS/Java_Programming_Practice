public class Find_no {
    public static void main(String[] args) {

        int x = 12221214;
        int count =0;
        int no = x;
        while (no!=0) {
            int rem = no%10;
            if (rem==2) {
                count++;
            }
            no = no/10;
            
        }
        System.out.println(count);

    }
}
