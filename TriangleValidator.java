import java.util.Scanner;
public class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value a:");
        int a =sc.nextInt();
        System.out.print("Enter the value b:");
        int b =sc.nextInt();
        System.out.print("Enter the value c:");
        int c =sc.nextInt();

        if(a+b>c){
            System.out.println("Valid");
        }else if(b+c>a){
            System.out.println("Valid");
        }else if(c+a>b){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
