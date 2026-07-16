// adress=base address+index*size
// approx index=2^31-1
// arrays are immutable
import java.util.*;
public class intro{
    public static void main(String[] args) {
        // int[] marks= new int[2];
        // // int marks[]=new int[2]; same 
        // // int marks[]={98,100};
        // marks[0]=98;
        // marks[1]=100;
        // // System.out.println(marks[0]);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        //input
        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();
        }
        // int x=sc.nextInt();
        // //output
        // for (int i = 0; i <size; i++) {
        //     System.out.print(nums[i]);
        //     if(nums[i]==x){
        //         System.out.print("x found at "+i);
        //     }
        // }
        // System.out.println("Sum of an elements");
        // int sum=0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum+=nums[i];
        // }
        // System.out.print(sum);
        
    }
}

