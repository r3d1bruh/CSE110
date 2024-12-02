import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int rp = x.nextInt();
        int cp = x.nextInt();
        int diff = cp - rp;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
        x.close();

        while (diff != 0) {
            if (diff >= 100) {
                diff -= 100;
                hundred++;
            } else if (diff >= 50) {
                diff -= 50;
                fifty++;
            } else if (diff >= 20) {
                diff -= 20;
                twenty++;
            } else if (diff >= 10) {
                diff -= 10;
                ten++;
            } else if (diff >= 5) {
                diff -= 5;
                five++;
            } else if (diff >= 2) {
                diff -= 2;
                two++;
            } else if (diff >= 1) {
                diff -= 1;
                one++;
            } else {
                System.out.print("error");
                break;
            }
        }

        System.out.println("100 taka notes: " + hundred);
        System.out.println("50 taka notes: " + fifty);
        System.out.println("20 taka notes: " + twenty);
        System.out.println("10 taka notes: " + ten);
        System.out.println("5 taka coins: " + five);
        System.out.println("2 taka coins: " + two);
        System.out.println("1 taka coins: " + one);
    }
}
