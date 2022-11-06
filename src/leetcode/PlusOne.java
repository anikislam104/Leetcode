package leetcode;
class Solution3 {
    public int[] plusOne(int[] digits) {
        int number=0;
        int coeff=1;
        int len=digits.length;
        for(int i=0;i<digits.length;i++){
            number+=digits[len-1-i]*coeff;
            coeff*=10;
        }
        System.out.println(number);
        number=number+1;
        int n=number;
        int new_len=0;
        while (n!=0){
            n=n/10;
            new_len++;
        }
        int[] new_digits=new int[new_len];
        for(int i=0;i<new_len;i++){
            new_digits[new_len-1-i]=number%10;
            number=number/10;
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
        int[] a={9,8,7,6,5,4,3,2,1,0};
        solution3.plusOne(a);
    }
}
