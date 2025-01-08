 public class Main
{
    public static boolean isPrime(int suspect)
    {
       for(int StatTrak = 2 ; StatTrak<suspect; StatTrak++)
        {
         if(suspect%StatTrak==0)
         {
          return false;
         }
        }
     return true;
    }
    public static boolean isPerfect(int suspect)
    {
       int sum =0;
       for (int StatTrak = 1; StatTrak < suspect; StatTrak++) 
       {
        if (suspect % StatTrak == 0) 
        {
            sum+=StatTrak;
        }
        
       } 
       if(sum == suspect)
       {
           return true;
       }
       return false;
    }
    public static int special_sum(int suspect)
    {
       int sum = 0;
       for (int StatTrak = 0; StatTrak <= suspect; StatTrak++) 
       {
            if(isPrime(StatTrak) && StatTrak!=1)
            {
                sum+=StatTrak;
            }
            if(isPerfect(StatTrak))
            {
                sum+=StatTrak;
            }
       } 
       return sum;
    }
    public static void main(String[] args)
    {
      int result = special_sum(8);
      System.out.println(result);
    }
}
