package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int strLen=strs.length;
        if(strLen==0){
            return "";
        }
        if(strLen==1){
            return strs[0];
        }
        int minLen=Integer.MAX_VALUE;
        int shortestWordIndex=0;
        for(int i=0;i<strLen;i++){
            if(strs[i].length()<minLen){
                minLen=strs[i].length();
                shortestWordIndex=i;
            }
        }
        String prefix="";
        for (int i=0;i<minLen;i++){
            String temp=strs[shortestWordIndex].substring(0,i+1);
            int count=0;
            for(int j=0;j<strLen;j++){
                if(strs[j].startsWith(temp)){
                    count++;
                }
            }
            if(count==strLen){
                prefix=temp;
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        String[] arr={"dog","racecar","car"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }
}
