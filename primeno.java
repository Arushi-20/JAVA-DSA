public class primeno {
    public static void main(String[] args) {
        int n=20;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not a prime");
                return ;
            }
            // System.out.println("prime number");
            System.out.println("Prime number");
        }
    }
}
