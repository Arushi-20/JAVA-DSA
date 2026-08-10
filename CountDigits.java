import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s= Integer.toString(n);
        System.out.println(s.length());

        String num= "123.432Arushi";
        System.out.println(num.length());
    }
}
