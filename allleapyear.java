import java.util.Scanner;
public class allleapyear
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Leap year count from which year?:  ");
        int yearmin = x.nextInt();
        System.out.print("Current year?:  ");
        int yearmax = x.nextInt();

        for(int year = yearmin; year <= yearmax; year++)
        {
            if (year%400==0 || (year%4==0 && year%100!=0))
            {
                System.out.println(year);
            } else
            {
                
            }
        }
        x.close();

    }
}    