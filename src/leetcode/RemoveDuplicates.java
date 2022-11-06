package leetcode;
class Solution2 {
    public int removeDuplicates(int[] nums) {
        int k=2;
        if(nums.length==1){
            return 1;
        }
        int distinct_num_count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                distinct_num_count++;
            }
        }
//        System.out.println(distinct_num_count);
        int last_distinct_index=0;
        int last_distinct_number=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=last_distinct_number){
                last_distinct_number=nums[i];
                last_distinct_index++;
                nums[last_distinct_index]=last_distinct_number;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return distinct_num_count;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        int[] a={1,1,1,2,2,3,3,4};
        solution2.removeDuplicates(a);
    }
}
