// 81. Search in Rotated Sorted Array II



class Solution {
    public boolean search(int[] nums, int target) {
       int pivot=bsp(nums);
       int n=nums.length;
        int bs1=bs(nums,target,0,pivot-1);
        int bs2=bs(nums,target,pivot,n-1);
        if(bs1!=-1||bs2!=-1)
          return true;
        else
        return false; 
    }
    public int bs(int[] arr,int t,int l,int h){
       
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==t)
            return mid;
            else if(arr[mid]==arr[l]&&arr[mid]==arr[h]){
                l++;
                h--;
            }
            else if(arr[mid]<=arr[h]) {
                if (arr[mid]<t&&t<=arr[h])
                    l=mid+1;
                else
                    h=mid-1;
            } 
            else {
                if(arr[l]<=t&&t<arr[mid])
                h=mid-1;
                else
                l=mid+1;
            }
        }
        return -1;
    }
    public int bsp(int[] nums){
        int l=0;
        int n=nums.length;
        int h=n-1;
        if(nums[h]>=nums[l])
        return 0;
        while(l<=h){
            int mid=(l+h)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev]){
                return mid;
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