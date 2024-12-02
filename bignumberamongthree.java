import java.util.Scanner;
public class bignumberamongthree
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("first number : ");
        int a = x.nextInt();
        System.out.print("second number : ");
        int b = x.nextInt();
        System.out.print("third number : ");
        int c = x.nextInt();

        if(a == b && a == c)
        {
            System.out.println("all are equal");
        }
        else if(b >= a && b >= c)
        {
            System.out.println(b + " is the largest number");
        }
        else if(c >= b && c >= a)
        {
            System.out.println(c + " is the largest number");
        } 
        else if(a >= b && a >= c)
        {
            System.out.println(a + " is the largest number");
        }
        

        x.close();

    }
}    

//Write a Java program that takes three numbers from the user and prints the greatest number.
    