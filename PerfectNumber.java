import java.util.*;
    public class PerfectNumber{
         public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        int sum=0,i;
        for(i=1;i<a;i++){
            if(a%i==0){
              sum=sum+i;
            }
        }
        if(sum==a){
            System.out.println("number is perfect ");
        }
        else{
            System.out.println("number is not perfect ");
        }
      }
    }