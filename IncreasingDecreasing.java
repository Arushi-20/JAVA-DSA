import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        //base case
        // if(n==0) return;

        if(n==1) {
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
