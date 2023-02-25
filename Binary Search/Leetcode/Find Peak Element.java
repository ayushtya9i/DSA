//Find Peak Element




class Solution {
    public int findPeakElement(int[] nums) {
      int l=0;
      int n=nums.length;
      int r=n-1;
      if(n<2)
      return 0;
     if(n==2){
         if(nums[0]<nums[1]){
             return 1;
         }
         else
         return 0;
     }
      while(l<=r){
          int mid=l+(r-l)/2;
          if(mid==0&&nums[mid]>nums[mid+1])
          return mid;
          else if(mid==n-1&&nums[mid]>nums[mid-1])
          return mid;
          else if(mid>0&&mid<n-1&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid + 1]){
              return mid;
          }
          else if(nums[mid]>nums[mid+1]){
              r=mid-1;
              
          }
          else{
              l=mid+1;
          }
      }  
      return r;
    }
}