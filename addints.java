import java.util.Scanner;

public class addints 
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("spill digits between 0 and 1000: ");

        int num = x.nextInt();

        int fd = num%10;

        int rd = num/10;

        int sd = rd%10;

        rd = rd/10;

        int td = rd%10;

        rd = rd/10;

        int d4 = rd%10;

        int total = fd+sd+td+d4;

        System.out.print(total);

        x.close();

    }

}