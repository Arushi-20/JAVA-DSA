import java.util.ArrayList;
// import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(25);
        arr.add(18);
        arr.add(15);
        arr.add(20);
        // System.out.println(arr[2]);
        System.out.println(arr.get(2));
        System.out.println(arr.set(3, 67));
        System.out.println(arr.get(3));
        arr.add(1,100);
        System.out.println(arr);
        // Collections.reverse(arr);
        // System.out.println(arr);
        
        //reverse an array
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j)); //arr of ith index pr jth lgana hai
            arr.set(j,temp);  //arr of jth index pr temp lgana hai
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
