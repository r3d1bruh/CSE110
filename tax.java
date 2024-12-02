/*Suppose a government employee has to pay 3000 taka 
plus 2.5% tax of his yearly salary. Now take the salary input 
from a user and print his tax.*/

import java.util.Scanner;
public class tax
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Salary amount in taka:  ");
        int salary = x.nextInt();
        System.out.print("Tax percentage:  ");
        float taxpercent = x.nextFloat();
        float taxpercenttemp = taxpercent/100;
        int tax = (int) (salary*taxpercenttemp);
        System.out.print("Amount of tax is:  " + tax+ " taka");
        x.close();

    }
}    
    