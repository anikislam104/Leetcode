package leetcode;
class Solution3 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[len-1]!=9){
            digits[len-1]+=1;
            return digits;
        }
        int carry=0;
        for(int i=0;i<digits.length;i++){
            int digit=digits[len-1-i];
            int digit_sum=0;
            if(i==0){
                digit_sum=digit+1;
                carry=digit_sum/10;
                digits[len-1]=digit_sum%10;
            }
            else{
                digit_sum=digit+carry;
                carry=digit_sum/10;
                digits[len-1-i]=digit_sum%10;
            }
        }
        if(carry==0){
            for(int i=0;i<len;i++){
                System.out.println(digits[i]);
            }
            return digits;
        }
        int new_len=len+1;
        int[] new_digits=new int[new_len];
        new_digits[0]=1;
        for(int i=0;i<new_len-1;i++){
            new_digits[i+1]=digits[i];
        }
        for(int i=0;i<new_len;i++){
            System.out.println(new_digits[i]);
        }
        return new_digits;
    }
}
public class PlusOne {
    public static void main(String[] args) {
        Solution3 solution3=new Solution3();
        int[] a={5,6,2,0,0,4,6,2,4,9};
        solution3.plusOne(a);
    }
}
