//Search Insert Position



class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=bs(nums,0,nums.length-1,target);
        return ans;
    }
    public int bs(int[] arr,int l,int r,int x){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x)
            return mid;
            if(arr[mid]>x)
            r=mid-1;
            else
            l=mid+1;
        }
        return l;
    }
}