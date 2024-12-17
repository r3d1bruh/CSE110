import java.util.Scanner;
public class posnegnum
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("input number:" );

        int num = x.nextInt();

        if(num > 0)
        {
            System.out.print("positive number" );
        }
        else if(num < 0)
        {
            System.out.print("negative number" );
        }
        else
        {
            System.out.print("neutral number" );
        }

        x.close();

    }
}    
    
