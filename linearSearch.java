public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,67,8};
        int target=8;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("target is present in array");
        else System.out.println("target is not present in the array");
    }
}
