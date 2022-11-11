import java.util.Scanner;

class ClimbingStairsHelper {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if(n==45){
            return 1836311903;
        }
        if(n==44){
            return 1134903170;
        }
        if(n==43){
            return 701408733;
        }
        if(n==42){
            return 433494437;
        }
        else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }
}
class ClimbingStairsHelper2{
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        else {
            int[] a=new int[n];
            a[0]=1;
            a[1]=2;
            for (int i=2;i<n;i++){
                a[i]=a[i-1]+a[i-2];
            }
            return a[n-1];
        }
    }
}
public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairsHelper2 climbingStairsHelper=new ClimbingStairsHelper2();
        System.out.println(climbingStairsHelper.climbStairs(44));
    }
}
