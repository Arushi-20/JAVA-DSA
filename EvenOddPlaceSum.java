import java.util.*;

public class EvenOddPlaceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String num = sc.next();  
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int position = i + 1;   // positions start from 1

            if (position % 2 == 0) {
                evenSum += digit;   // even place
            } else {
                oddSum += digit;    // odd place
            }
        }

        System.out.println("Sum of digits at ODD places = " + oddSum);
        System.out.println("Sum of digits at EVEN places = " + evenSum);
    }
}
