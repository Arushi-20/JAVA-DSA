public class position {
    public static void main(String[] args) {
        int num=34512;
        int position=0;
        int sum=0;
        position++;
        while(num>0){
            
            int lastdigit=num%10;
            sum=sum+position*(int)Math.pow(10,lastdigit-1);
            num=num/10;
        }
        System.out.println(num);

    }
}
