 public class task05
{
    public static void showDots(int limit)
    {
       for(int StatTrak = 1; StatTrak<=limit; StatTrak++)
       {
        System.out.print(".");
       }
    }
    public static void show_palindrome(int limit)
    {
       for(int StatTrak = 1; StatTrak<=limit; StatTrak++)
       {
        System.out.print(StatTrak);
       }
       for(int StatTrak = limit-1; StatTrak>=1; StatTrak--)
       {
        System.out.print(StatTrak);
       }
    }
    public static void showDiamond(int limit)
    {
       for(int StatTrak = 1; StatTrak<=limit; StatTrak++)
       {
          showDots(limit-StatTrak);
          show_palindrome(StatTrak);
          showDots(limit-StatTrak);
          System.out.println();
       }
       for(int StatTrak = limit-1; StatTrak>=1; StatTrak--)
       {
          showDots(limit-StatTrak);
          show_palindrome(StatTrak);
          showDots(limit-StatTrak);
          System.out.println();
       }
    }   
    public static void main(String[] args)
    {
      showDiamond(5);
    }
}
