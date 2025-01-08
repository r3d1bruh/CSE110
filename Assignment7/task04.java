 public class task04
{
    public static boolean isPrime(int suspect)
    {
       for(int StatTrak = 2 ; StatTrak<suspect; StatTrak++)
        {
         if(suspect%StatTrak==0)
         {
          return true
         }
        }
     return false
    }
    public static void main(String[] args)
    {
       boolean check = isPrime(7);
       System.out.println(check);
    }
}
