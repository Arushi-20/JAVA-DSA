import java.util.Scanner;
public class FindGreatest3rdNo {
    public static void main(String[] args) {
        // if(1) not work
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("First number is greater");
            }else{
                System.out.println("Third number is greater");
            }
        }
        else {
            if(b>c){
                System.out.println("Second number is greater");
            }
            else{
                System.out.println("Third number is greater");
            }
            
        }
        
    }
}
