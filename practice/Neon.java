public class Neon {
    public static void main(String[] args) {


        for(int i = 0; i<=10000; i++)
        {

        int no = i;
        int x = no;
        x = x*x;
        int sum = 0;
        while (x!=0) {
            int rem = x%10;
            sum = sum + rem;
            x = x/10;     
        }

        if (sum==no) {
            System.out.println( i+"is  neon number");
            
        }
        // else{
        //     System.out.println("The number is not a neon number");
        // }
    }

    }
}
