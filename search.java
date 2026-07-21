public class search {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int x=19;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("x is exist");
        }else{
            System.out.println("x is not exist");
        }
    }    
}
