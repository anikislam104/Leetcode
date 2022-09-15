package leetcode;

import static java.lang.Math.abs;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        int sum=0;
        int ans=0;
        while(true){
            if(dividend>0 && divisor>0) {
                if(dividend<divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                if (sum == dividend) {
                    return ans;
                } else if (sum > dividend) {
                    return ans - 1;
                }
            }
            else if(dividend>0 && divisor<0){
                sum -= divisor;
                ans++;
                if (sum == dividend) {
                    return ans*-1;
                } else if (sum > dividend) {
                    return (ans - 1)*-1;
                }
            }
            else if(dividend<0 && divisor>0){
                if(dividend<divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                int temp=dividend*-1;
                if (sum == temp) {
                    return -ans;
                } else if (sum > temp) {
                    return -(ans - 1);
                }
            }
            else{
                if(dividend>divisor){
                    return 0;
                }
                sum += divisor;
                ans++;
                if (sum == dividend) {
                    return ans;
                } else if (sum < dividend) {
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
