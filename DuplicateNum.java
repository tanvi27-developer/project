import java.util.*;
public class DuplicateNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        boolean isDuplicate=false;
        int []arr=new int[5];
        System.out.println("Enter the 5 elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(isDuplicate)
                break;
        }
        if(isDuplicate){
        System.out.println("True");
    }else{
        System.out.println("false");
    }
        

    }
    
    
}
