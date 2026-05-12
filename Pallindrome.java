class Pallindrome{
    public static void main(String []args){
        int n=122,rev=0,r;
        int temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}