package leetcode;

import java.util.ArrayList;

class Solution {
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      int len1=0,len2=0;
      ListNode temp=list1;
      int[] values=new int[100];
      while(temp.next!=null){
          values[len1]=temp.val;
          len1++;
          temp=temp.next;
      }
      values[len1]=temp.val;
      len1++;
      System.out.println(len1);
      temp=list2;
      while (temp.next!=null){
          values[len1+len2]= temp.val;
          len2++;
          temp=temp.next;
      }
      values[len1+len2]= temp.val;
      len2++;
     System.out.println(len2);
     int[] finalValues=new int[len1+len2];
     for(int i=0;i<len1+len2;i++){
//         System.out.println(values[i]);
         finalValues[i]=values[i];
     }
     int len=len1+len2;
     for(int i=0;i<len;i++){
         int min_idx=-1;
         int min=101;
         for(int j=i;j<len;j++){
             if(finalValues[j]<min){
                 min_idx=j;
                 min=finalValues[j];
             }
         }
//         System.out.println(min);
         if(min_idx>-1){
             int tmp=finalValues[i];
             finalValues[i]=min;
             finalValues[min_idx]=tmp;
         }
     }
     ListNode finalList=new ListNode();
     temp=finalList;
     for(int i=0;i<len1+len2;i++){
         temp.val=finalValues[i];
         if(i!=len-1){
             ListNode temp2=new ListNode(finalValues[i+1]);
             temp.next=temp2;
             temp=temp.next;
         }
//         System.out.println(finalValues[i]);
     }

      return finalList;
 }
}
public class MergeTwoLists {
 public static void main(String[] args) {
   //make listnode [1,2,4]
   ListNode l13=new ListNode(4);
   ListNode l12=new ListNode(2,l13);
   ListNode l1=new ListNode(1,l12);
   //make listnode [1,3,4]
   ListNode l23=new ListNode(4);
   ListNode l22=new ListNode(3,l23);
   ListNode l2=new ListNode(1,l22);

   Solution solution=new Solution();
//     System.out.println(solution.mergeTwoLists(l1,l2).next.next.next.next.next..val);
 }
}
