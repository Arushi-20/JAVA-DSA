public class RotateANumber {
    public static void main(String[] args) {
        int n=12345;
        int a= n%100;
        int last=n/100;
        // System.out.println(last);
        int first=a*1000;
        // System.out.println(first);
        int total=first+last;
        System.out.println(total);

        
    }
}
