 public class task04
{
    public static boolean isPrime(int suspect)
    {
       if((alpha+beta)>gamma && (beta+gamma)>alpha && (alpha+gamma)>beta)
       {
        return true;
       }       
       else 
       {
        return false;
       }   
    }
    public static void triArea(int alpha, int beta, int gamma)
    {
       if(isTriangle(alpha,beta,gamma))
       {
        double s = (alpha+beta+gamma)/2;
        System.out.println(Math.sqrt(s*(s-alpha)*(s-beta)*(s-gamma)));
       }
       else
       {
        System.out.println("Can't form triangle");
       }
    }
    public static void main(String[] args)
    {
        triArea(3,2,1);
    }
}
