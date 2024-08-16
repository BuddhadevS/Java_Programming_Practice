public class Spy {
    public static void main(String[] args) {
        for(int i = 0; i<=1000; i++)
        {
        int x = i;
        int no= x;
        int sum = 0;
        int mul = 1;
        while (no!=0) {
            int rem = no%10;
            sum = sum+ rem;
            mul = mul*rem;
            no = no/10;
            
        }
        if (sum == mul) {
            System.out.println("The number is a spy no"+i);
        }
        // else
        // {
        //     System.out.println("The no is not a spy no");
        // }
    }
    }
}
