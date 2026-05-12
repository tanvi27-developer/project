import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
        int a=0,b=1;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println(a);
            temp=a+b;
            a=b;
            b=temp;
    
        }
    }
    
}
