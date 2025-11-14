
import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);  

        // convert character to lowercase 
        // c = Character.toLowerCase(c);

        // char c='a';
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Vowels");
        }else{
            System.out.println("Consonent");
        }

    }
}
