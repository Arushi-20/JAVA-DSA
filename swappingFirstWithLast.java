import java.util.Scanner;
public class swappingFirstWithLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digits = (int) Math.log10(num); // total digits - 1
        int first = num / (int) Math.pow(10, digits); 
        int last = num % 10; 

        int mid = (num % (int) Math.pow(10, digits)) / 10;

        int swapped = last * (int) Math.pow(10, digits) + mid * 10 + first;

        System.out.println("Swapped number: " + swapped);
    }

}
