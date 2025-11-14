import java.util.*;
public class CountPrimes {
    public int Primes(int n){
        if(n<=2){
            return 0;
        }
        boolean[] composite=new boolean[n];
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){
            if(composite[i]==false){
                for(int j=i*i;j<n;j+=i){
                    composite[j]=true;
                }
            }

        } 
        int count =0;
        for(int i=2;i<n;i++){
            if(composite[i]==false){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        CountPrimes obj=new CountPrimes();
        // int n=20;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int result= obj.Primes(n);
        System.out.println(result);
        //obj.Primes(n);
    }
}
