public class LCM {
    public static void main(String[] args) {
        int num1=4;
        System.out.print("Multiple of 4 are:");
        for (int i = 1; i <=10; i++) {
            System.out.print((i*num1)+" ");
        }
        
        System.out.println(" ");
        int num2=6;
         System.out.print("Multiple of 6 are:");
        for (int i = 1; i <=10; i++) {    
            System.out.print((i*num2)+" ");
        }
        
    System.out.println(" ");
    int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to find GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
