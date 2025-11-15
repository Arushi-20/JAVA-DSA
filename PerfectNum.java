public class PerfectNum {
    public static void main(String[] args) {
        int n=28;
        int sum = 0;
        System.out.print("Divisors: ");

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i + " ");  // show which numbers are added
            }
        }

        if (sum == n) {
            System.out.println("\n"+ n + " is a Perfect Number");
        } else {
            System.out.println("\n"+ n + " is NOT a Perfect Number");
        }
    }
}
