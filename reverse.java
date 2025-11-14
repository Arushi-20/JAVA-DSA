import java.util.*;
public class reverse {
    public int rev(int x){
        int reversed=0;
        while (x!=0) {
            int digit=x%10;
            reversed=reversed*10+digit;
            x=x/10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        reverse obj=new reverse();
        int result=obj.rev(x);
        System.out.println(result);
    }
}
