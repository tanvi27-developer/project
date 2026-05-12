import java.util.*;
public class ConvertNumToWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num=sc.nextInt();
        String ones[]={
            "Zero","one","Two","Three","Four","Five","Six","Seven","eight","Nine","ten",
            "Eleven","Twelve","Thirteen","fourteen","fifteen","sixteen","Seventeen","eighteen","nighteen"};
        
        String tens[]={
           "","", "Twenty","Thirty","Fourty","fifty","Sixty","Seventy","eighty","Ninety"
        };
        if(num<20){
            System.out.print(ones[num]);
        }else if(num<100){
            System.out.print(tens[num/10]+""+ones[num%10]);

        }
        else{
            System.out.print(ones[num/100]+"Hundred");
            int r=num%100;
            if(r<20){
                System.out.print(ones[r]);
            }else{
                System.out.print(tens[r/10]+""+ones[r%10]);
            }
        }
    }
}
