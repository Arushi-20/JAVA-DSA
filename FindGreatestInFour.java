import java.util.Scanner;
public class FindGreatestInFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter a:");
        int a=sc.nextInt();
        
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
        System.out.print("Enter c:");
        int c=sc.nextInt();
        
        System.out.print("Enter d:");
        int d=sc.nextInt();

        if(a>b){
            if(a>c && a>d){
                System.out.println("First number is greatest");
            }else if(c>a){
                System.out.println(c);
            }else{
                System.out.println(d);
            }
        }
        else if(b>c){
            if(b>d){
                System.out.println("Second");
            }else if(b<c){
                System.out.println(c);
            }else{
                System.out.println(d);
            }
           
        }else if(c>d){
            System.out.println("Third");
        }
        else{
            System.out.println("Fourth");
        }
    }
}
