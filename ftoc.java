import java.util.Scanner;

public class ftoc {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);

        System.out.println("input F");
        int f = x.nextInt();


        System.out.println(((f-32)*5)/9);
        x.close();
    }

    
}

