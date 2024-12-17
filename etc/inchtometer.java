import java.util.Scanner;

public class inchtometer
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("What is the colour of your inch bro?: ");

        double inch = x.nextDouble();

        System.out.println("your johnson of "+inch+" inch is equal to "+ inch*0.0254 + " meters bro");
        
        x.close();

    }
}
