 public class task04
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
    public static void main(String[] args)
    {
     System.out.println(isPerfect(33));
    }
}
