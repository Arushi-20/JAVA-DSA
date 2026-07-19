public class min {
    public static void main(String[] args) {
        int[] arr={1,2,4,0,44};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int minVal=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
            minVal=arr[i];
        }
        }
        return minVal;
    }
}
