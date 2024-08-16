public class Palindrom_11_100 {
    public static void main(String[] args) {
        for(int i = 11; i<=200; i++)
        {
            int x = i;
            int no = x;
            int rev = 0;
            while (no!=0) {
                int rem = no%10;
                rev = rev*10 + rem;
                no= no/10;
                
            }
            if (rev==x) {
                System.out.println(i);
            }
        }
    }
}
