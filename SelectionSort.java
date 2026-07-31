package Sortings;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={8,4,1,9,-3,6,5};
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<arr.length;j++){
                //find minimum element
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }  
            }
            //swap the minimum element with the first indexed element
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
}
