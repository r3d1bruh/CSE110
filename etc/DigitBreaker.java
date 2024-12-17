import java.util.Scanner;
public class DigitBreaker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input digits: ");
        int num = x.nextInt();
        
        int tempnum = num;
        int i = 0;
        int mod = 1;
        
        // Determine the highest place value of the number
        while (tempnum != 0) {
            tempnum /= 10;
            i++;
        }
        
        // Calculate 10^(i-1), which is the highest place value for the number
        for (int k = 1; k < i; k++) {
            mod *= 10;
        }

        System.out.print("Expected Output: ");
        while (num != 0 && mod != 0) {
            System.out.print(num / mod + " ");
            num = num % mod;  // Update num to remove the most significant digit
            mod /= 10;        // Move to the next place value
        }
        
        x.close();
    }
}
