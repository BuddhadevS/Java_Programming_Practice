public class Unique_1 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,5,1};
        
        for(int i= 0; i<arr.length; i++)
        {
            int count = 0;
            for(int j =0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;

                }         
            }
            if (count==1) {
                System.out.println(arr[i]+" "+"unique element found"+" "+count+" "+"times");
                
            }
            
        }
    }
}
