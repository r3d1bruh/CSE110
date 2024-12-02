import java.util.Scanner;

public class mintoyearanddayssimplified 
{
    public static void main(String[] bracugay)    
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Input data in minutes: ");

        int min = x.nextInt();

        int year = min/(60*24*365);

        int days = (min/(60*24))%365;

        System.out.print("Output is: "+ year + " years "+ days + " days");

        x.close();
    }
}
