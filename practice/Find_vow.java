public class Find_vow {
    public static void main(String[] args) {
        String []arr={"Hello","Hi","Bye"};
        int count =0;
        
        for(int i=0; i<arr.length; i++)
        {
            String d = arr[i];
           
            
            for(int j=0; j<d.length(); j++)
            {
                if (d.charAt(j)=='a' || d.charAt(j)=='e'||d.charAt(j)=='i'||d.charAt(j)=='o'||d.charAt(j)=='u') {

                    count++;
                }
            }
            
        }
        System.out.println("No of vowel is"+" "+count+" "+"times");
        
    }
}
