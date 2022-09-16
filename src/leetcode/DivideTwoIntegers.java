package leetcode;

import static java.lang.Math.abs;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        int sum=0;
        int ans=0;
        while(true){
            if(dividend>=0 && divisor>0) {
                if(dividend<divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                if (sum == dividend) {
                    if(ans>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                    return ans;
                } else if (sum > dividend) {
                    if(ans>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                    return ans - 1;
                }
            }
            else if(dividend>=0 && divisor<0){
                int absoluteDivisor= -divisor;
                if(dividend<absoluteDivisor){
                    return 0;
                }
                sum += absoluteDivisor;
                ans++;
                if (sum == dividend) {
                    if(ans>Integer.MAX_VALUE+1){
                        return Integer.MIN_VALUE;
                    }
                    return -ans;
                } else if (sum > dividend) {
                    if(ans>Integer.MAX_VALUE+1){
                        return Integer.MIN_VALUE;
                    }
                    return 1-ans;
                }
            }
            else if(dividend<0 && divisor>0){
                int absoluteDividend= -dividend;
                if(absoluteDividend<divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                if (sum == absoluteDividend) {
                    if(ans>Integer.MAX_VALUE+1){
                        return Integer.MIN_VALUE;
                    }
                    return -ans;
                } else if (sum > absoluteDividend) {
                    if(ans>Integer.MAX_VALUE+1){
                        return Integer.MIN_VALUE;
                    }
                    return 1-ans;
                }
            }
            else{
//                System.out.println("here");
                if(dividend>divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                if (sum == dividend) {
                    System.out.println(ans);
                    if(ans>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                    return ans;
                } else if (sum < dividend) {
                    if(ans>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                    return ans - 1;
                }
            }

        }
//        return 0;
    }

    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers=new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divide(-2147483648,-1));
    }
}
