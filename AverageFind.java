class AverageFind{
    public static void main(String[]args){
        int arr[]={10,2,3,4,5,6,7,8,9};
        double sum=0,avg;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.print(avg);
    }
}