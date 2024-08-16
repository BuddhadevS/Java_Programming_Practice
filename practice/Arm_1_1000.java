public class Arm_1_1000 {
    public static void main(String[] args) {
        for(int i = 1; i<=1000; i++)
        {

            int x = i;
            int arm =x;
            int sum = 0;
            while (arm!=0) {
                int rem = arm%10;
                sum = sum+ rem*rem*rem;
                arm = arm/10; 
            }

            if (sum==x) {
                System.out.println(i);
            }

            

        }
        
    }
}
