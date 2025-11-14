import java.util.Scanner;
public class AbsDiffCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value x:");
        int x =sc.nextInt();
        System.out.print("Enter the value y:");
        int y =sc.nextInt();
        int difference=x-y;
        int absolute=Math.abs(difference);

        if(absolute>=10){
            System.out.println("Large difference");
        }else{
            System.out.println("Small Difference");
        }
    }
}
