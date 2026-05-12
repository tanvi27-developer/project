public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int result=maxFind(arr,arr.length);

        System.out.println("Maximum element: " + result);
    }
    static int maxFind(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        int max=maxFind(arr,n-1);
        if(arr[n-1]>max){
            return arr[n-1];
        }else{
            return max;
        }

    }
}