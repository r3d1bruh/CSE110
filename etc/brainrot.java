import java.util.Scanner;

public class brainrot 
{
    public static void main(String[] EbtyGay)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("value of a: ");
        int a = x.nextInt();

        System.out.print("value of b: ");
        int b = x.nextInt();

        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int avg = (a+b)/2;
        System.out.println("Expected Output: ");

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + diff);
        System.out.println("Product of two integers: " + prod);
        System.out.println("Average of two integers:" + avg);

        if(a>b)
        {
            System.out.println( a + " is the larger number");
            System.out.println(b + " is the smaller number");
        } else{
            System.out.println(b + " is the larger number");
            System.out.println(a + " is the smaller number");
        }

        x.close();

    }
}
