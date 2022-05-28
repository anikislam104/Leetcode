package leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int idx1=-1,idx2=-1;
        int len=nums.length;
        int done=0;
        for(int i=0;i<len;i++){
            if(done==1){
                break;
            }
            for (int j=0;j<len;j++){
                if(nums[i]+nums[j]==target && i!=j){
//                    System.out.println(nums[i]+" "+nums[j]);
                    idx1=i;
                    idx2=j;
                    done=1;
                    break;
                }
            }
        }
        int[] arr=new int[2];
        arr[0]=idx1;
        arr[1]=idx2;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4};
        TwoSum twoSum=new TwoSum();
        System.out.println(twoSum.twoSum(arr,6)[1]);
    }
}
