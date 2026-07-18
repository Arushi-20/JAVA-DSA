import java.util.Scanner;
import java.util.*;


public class Arrays{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // int[] arr={1,2,3,4,5};
        // System.out.println(arr[3]);


        // String[] a={"Sharma","Arushi"};
        // System.out.println(a[1]);

        //input using the for loop
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]+" ");
        // }

        //num represents the element of an array
        for(int num: arr){
            System.out.println(num+" ");
        }

        //taking array and convert into the string
        // System.out.println(Arrays.toString(arr));


        //arrays of objects
        // String[] str=new String[5];
        // for(int i=0;i<str.length;i++){
        //     str[i]=in.next();
        // }
        // System.out.println(Arrays.toString(str));

        //modify
        arr[1]=10;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        
    }
}
