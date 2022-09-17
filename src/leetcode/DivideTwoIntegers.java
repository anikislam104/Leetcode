package leetcode;

import static java.lang.Math.abs;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        int sum=0;
        int ans=0;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor==1){
            return Integer.MIN_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor==Integer.MIN_VALUE){
            return 1;
        }
        if(dividend==Integer.MIN_VALUE && divisor==Integer.MAX_VALUE){
            return 0;
        }
        if(dividend==Integer.MAX_VALUE && divisor==Integer.MIN_VALUE){
            return 0;
        }
        if(dividend==Integer.MAX_VALUE && divisor==Integer.MAX_VALUE){
            return 1;
        }
        if(dividend==Integer.MAX_VALUE && divisor==-1){
            return Integer.MIN_VALUE;
        }
        if(dividend==Integer.MAX_VALUE && divisor==1){
            return Integer.MAX_VALUE;
        }
        if(dividend==0){
            return 0;
        }
        if(divisor==1){
            return dividend;
        }
        if(divisor==-1){
            return -dividend;
        }
        if(dividend==divisor){
            return 1;
        }
        if(dividend==-divisor){
            return -1;
        }

        while(true){
            if(dividend>=0 && divisor>0) {
                if(dividend<divisor){
                    return 0;
                }
                if(Integer.MAX_VALUE-sum<divisor){
                    return ans;
                }
                sum += divisor;
                ans++;
                if (sum == dividend) {

                    if(ans<0){
                        return Integer.MAX_VALUE;
                    }
                    return ans;
                } else if (sum > dividend) {

                    if(ans<0){
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
                if(Integer.MAX_VALUE-sum<absoluteDivisor){
                    return ans;
                }
                sum += absoluteDivisor;
                ans++;
                if (sum == dividend) {


                    return -ans;
                } else if (sum > dividend) {

                    return 1-ans;
                }
            }
            else if(dividend<0 && divisor>0){
                int absoluteDividend= -dividend;
                System.out.println(absoluteDividend);
                if(absoluteDividend<divisor){
                    return 0;
                }

                sum += divisor;
                ans++;
                if (sum == absoluteDividend) {

                    return -ans;
                } else if (sum > absoluteDividend) {

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
//                    System.out.println(ans);

                    if(ans<0){
                        return Integer.MAX_VALUE;
                    }
                    return ans;
                } else if (sum < dividend) {
                    if(ans<0){
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
        System.out.println(divideTwoIntegers.divide(-2147483648,2));
    }
}
