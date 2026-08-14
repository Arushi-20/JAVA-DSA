public class functionCallingItself {
    public static void main(String[] args) {
        library(1);
    }

    public static void library(int n){
        if(n==9) return;
        System.out.println(n);
        library(n+1);
    }
}
