public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=4;
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("target found with the sum of index "+i+" "+j);
                }
            }
        }
    }
}
