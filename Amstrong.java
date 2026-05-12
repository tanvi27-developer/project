class Amstrong {
    public static void main(String[]args){
        int n=153,sum=0,r=0;
        int temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");

        }
    }
}
