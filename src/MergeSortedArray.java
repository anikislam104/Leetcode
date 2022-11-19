class MergeSortedArrayHelper {
    int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    void quick_sort(int[] arr,int low,int high){
        if(low<high){
            int partition_index=partition(arr,low,high);
            quick_sort(arr,low,partition_index-1);
            quick_sort(arr,partition_index+1,high);
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        for(int i=0;i<m+n;i++){
//            System.out.print(nums1[i]);
        }
        quick_sort(nums1,0,m+n-1);
        for(int i=0;i<m+n;i++){
            System.out.println(nums1[i]);
        }
    }
}
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        MergeSortedArrayHelper mergeSortedArrayHelper=new MergeSortedArrayHelper();
        mergeSortedArrayHelper.merge(nums1,3,nums2,3);
    }
}
