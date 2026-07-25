import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(8);
        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        arr.add(29);
        arr.add(1, 20);
        System.out.println(arr);

        //reverse
        // Collections.reverse(arr);
        // System.out.println(arr);

        //another way of reverse the elements
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            //it means array ki ith position pr jth element dalna hai
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

        arr.remove(arr.size()-1);
        System.out.println(arr);


    }
}
