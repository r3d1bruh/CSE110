import java.util.Scanner;
public class leapyear
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        int year = x.nextInt();

        if (year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println(year +" : It is a leapyear");
        } else
        {
            System.out.println(year + " : NOT A LEAP YEAR");
        }

        x.close();

    }
}    
    
