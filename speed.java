import java.util.Scanner;
public class speed 
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        float meter = x.nextFloat();
      
        float hour = x.nextFloat();
        float hourToSec = hour*3600;

        float min = x.nextFloat();
        float mintosec = min*60;
        float mintohour = min/60;

        float sec = x.nextFloat();
        float sectohour = sec/3600;

        float km = meter/1000;
        float miles = (float) (meter/1609.344);

        float secintotal = hourToSec+ mintosec + sec;
        float totalhour = sectohour + mintohour + hour;

        System.out.println("Your speed in meters/second is: "+ meter/secintotal);
        System.out.println("Your speed in km/h is is: "+ km/totalhour);  
        System.out.println("Your speed in miles/h is: "+ miles/totalhour);  

        x.close();
    }
}
