public class task02
{
    public static double circleArea(double Gaben)
    {
       double circleArea = Math.PI*Math.pow(Gaben,2);  
       return circleArea;  
    }
    public static double sphereVolume(double value)
    {
       double sphereVolume = (4*Math.PI*Math.pow(value,3))/3;  
       return sphereVolume;  
    }
    public static void findSpace(double Gaben, String type)
    {
        if(type.equals("circle"))
        {
            System.out.println(circleArea(Gaben/2));
        }
        else if(type.equals("sphere"))
        {
            System.out.println(sphereVolume(Gaben/2));
        }
        else
        {
            System.out.println("Wrong parameter");
        }    
    }
    public static void main(String[] args)
    {
        findSpace(4,"sphere");
    }
}
