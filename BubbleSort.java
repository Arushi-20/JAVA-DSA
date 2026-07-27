package Sortings;

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    //Basic approach
    // public static void main(String[] args) {
    //     int[] arr={5,-2,6,7,2,8,7,3};
    //     int n=arr.length;
    //     print(arr);
    //     for(int j=0;j<n-1;j++){
    //         for(int i=0;i<n-1-j;i++){
    //         if(arr[i]>arr[i+1]){
    //             int temp= arr[i];
    //             arr[i]=arr[i+1];
    //             arr[i+1]=temp;
    //         }
    //     }
    //     }
    //     print(arr);
    // }


    //Optimised approach
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,8,7,3};
        int n=arr.length;
        print(arr);

        for(int i=0;i<n-1;i++){
            // boolean isSorted= true;
            // //check array is sorted or not 
            // for(int j=0;j<n-1;j++){
            //     if(arr[j]>arr[j+1]){
            //         isSorted=false;
            //         break;
            //     }
            // }
            // if(isSorted==true) break;


            //another way to check the array is sort or not that we count the number of swaps if swaps is 0 then we break 
            int swaps=0;
            //now sort the array
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }
}
