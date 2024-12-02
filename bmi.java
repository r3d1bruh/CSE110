import java.util.Scanner;
public class bmi 
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("height in meters: ");
        float m = x.nextFloat();
        System.out.print("weight in Kgs: ");
        float kg = x.nextFloat();
        float bmi = kg/(m*m);        
        System.out.println("BMI is:"+ bmi);
        if(bmi>=40)
        {
            System.out.print("Obesity III: What a fucking obese! ");
        } 
        else if(35<= bmi && 40 > bmi) 
        {
            System.out.print("Obesity II: What a fucking obese! ");
        } 
        else if(30<= bmi && 35 > bmi)
        {
            System.out.print("Obesity I: What a fucking obese! ");
        }  
        else if(25<= bmi && 30 > bmi) 
        {
            System.out.print("Overweight: Burn some weight and go to gym bruh ");
        } 
        else if(18.5<= bmi && 25 > bmi) 
        {
            System.out.print("Normal: Keep it up king :) ");
        } 
        else
        {
            System.out.print("Underweight: Go to gym bro ");
        }
        x.close();
    }
}
