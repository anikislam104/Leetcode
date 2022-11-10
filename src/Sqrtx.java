class Solution2 {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int loop_end;
        if(x%2==0){
            loop_end=x/2;
        }
        else{
            loop_end=(x-1)/2;
        }
        int curr_diff;
        for(int i=1;i<=loop_end;i++){
            int square_product=i*i;
            curr_diff=x-square_product;
//            System.out.println(curr_diff+" "+prev_diff);
            if(curr_diff==0){
                return i;
            }
            else if(curr_diff<0){
//                System.out.println(i-1);
                return i-1;
            }
        }
        return loop_end;
    }
}
public class Sqrtx {
    public static void main(String[] args) {
        Solution2 solution=new Solution2();
        System.out.println(solution.mySqrt(123));
    }
}
