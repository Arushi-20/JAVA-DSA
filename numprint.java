public class numprint {
    public static void main(String[] args) {
        int n=12345;
        int copy=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        // System.out.println(count);
        int pow=(int) Math.pow(10,count-1);
        n=copy;
        while(n>0){
            int FirstDigit=n/pow;
            System.out.println(FirstDigit);
            n=n%pow;//remove first digit 
            pow=pow/10;

        }
    
    }


}
