public class Stronng {
    public static void main(String[] args) {


        for(int j = 1; j<=10000; j++)
        {        
        int a = j;
        int no = a;
        int sum = 0;
        
        while (no!=0) {
            int rem = no%10;
            int fact = 1;
            for(int i = rem; i>=1; i--)
            {
                fact = fact*i;
            }
            int rem2 = fact;
            sum = sum+ rem2;
            no = no/10;

        }
        if (sum==a) {
            System.out.println("The no is a strong "+ j);
            
        }

    }

    }
}
