// 153. Find Minimum in Rotated Sorted Array



class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int n=nums.length;
        int h=n-1;
        if(nums[h]>=nums[l])
        return nums[0];
        while(l<=h){
            int mid=(l+h)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev]){
                return nums[mid];
            }
            else if(nums[0]<=nums[mid]){
                l=mid+1;
            }
            else
             h=mid-1; 
        }
        return 0;
    }
}