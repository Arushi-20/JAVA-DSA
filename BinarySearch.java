package BinarySearchh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,7,28,100};
        int target=28;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) System.out.println(mid);
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        
    }
}