public class FindElements {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int element = 15;

        int index = findEle(arr, arr.length - 1, element);

        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }

    public static int findEle(int arr[], int n, int element){
        // Base case
        if(n < 0)
            return -1;

        // If element found
        if(arr[n] == element)
            return n;

        // Recursive call
        return findEle(arr, n - 1, element);
    }
}