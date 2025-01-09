import java.util.Scanner;
public class task06
{
    public static double calcTax(int age, double salary)
    {
       if(age<18 || salary <10000)
       {
            return 0;
       }
       else
       {
        if(salary<=20000)
        {
            return salary*0.07;
        }
        else
        {
            return salary*0.14;
        }
       }
    }
    public static void calcYearlyTax()
    {
       double sum =0;
       Scanner x = new Scanner(System.in); 
       System.out.print("Enter your age:"); 
       int age = x.nextInt();
       double[] tax = new double[12];
       for(int StatTrak = 0; StatTrak<12; StatTrak++)
       {
           tax[StatTrak] = x.nextDouble();
       }
       for(int StatTrak = 0; StatTrak<12; StatTrak++)
       {
           double monthlyTax = calcTax(age, tax[StatTrak]);
           System.out.println("Month"+StatTrak+" tax:"+ monthlyTax);
           sum+=monthlyTax;
       }
       System.out.println("Total Yearly Tax: "+sum);
    }
    public static void main(String[] args)
    {
        calcYearlyTax();
    }
}
