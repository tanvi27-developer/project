public class RemoveDuplicate {
    public static void main(String[]args){
        int arr[]={2,3,2,5};
       
        for(int i=0;i<arr.length;i++){
             boolean isduplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicate=true;
                    break;

                }
            }
            if(!isduplicate){
                System.out.println(arr[i]);
            }

        }
        

        
    }
    
}
