import java.util.*;
public class PerfectSquare {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the Number: ");
    //     int num=sc.nextInt();
    //     boolean isPerfect=false;
    //     for(int i=1;i*i<=num;i++){
    //        if(i*i==num){
    //         isPerfect=true;
    //         break;

    //        }
    //     }
    //     if(isPerfect){
    //         System.out.println(num+" is perfect Square");
    //     }else{
    //          System.out.println(num+" is  not perfect Square");
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        if(isPerfectSquare(num,1)){
             System.out.println(num+" is perfect Square");
        }
        else{
             System.out.println(num+" is  not perfect Square");
        }
    }
    public static boolean isPerfectSquare(int num,int i){
        if(i*i>num){
            return false;
        }
        if(i*i==num){
            return true;
        }
        return isPerfectSquare(num,i+1);
    }
    
}
