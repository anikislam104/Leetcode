package leetcode;

public class PalindromeNumber {
    boolean isPalidrome(int x){
        int len=Integer.toString(x).length();
        String str=Integer.toString(x);
//        System.out.println(str.charAt(0));
        if(len==1){
            return true;
        }
        int check=0;
        for(int i=0;i<len/2;i++){
//            System.out.println(str.charAt(i));
            if(str.charAt(i)!=str.charAt(len-1-i)){
                check=1;
            }
        }
        if(check==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        System.out.println(palindromeNumber.isPalidrome(1233421));
    }
}
