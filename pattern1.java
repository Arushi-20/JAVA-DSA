public class pattern1 {
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=n-i; j++) {
            if(j<=i){
                System.out.print("*");
            }
           
           }
             System.out.println();
        }
    }
}
