/*Write a flowchart that finds the number of 
hours, minutes, and seconds in a given number of 
seconds. For example, how many hours, minutes, and 
seconds are there in 10,000 seconds?*/

import java.util.Scanner;
public class s2hms
{
    public static void main(String[] nigger)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int s = x.nextInt();
        int h = s/3600;
        int m = (s/60)%60;
        int rs = s%60;
        System.out.print(h +" hours "+m +" minutes "+ rs +" seconds ");
        x.close();

    }
}    