//Find First and Last Position of Element in Sorted Array




class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans ={-1,-1};
       int n=nums.length;
        
       int s1=bs(nums,0,n-1,target,-1,-1);
    //    int s2=bs(nums,0,n-1,target,-1,-1);
if(n==1&&s1==0){
        return new int[]{0,0};
    }
    int s2=-1;
   
    if(s1-1>0&&s1+1<n){
    if(s1!=-1&&nums[s1-1]==target)
    s2=s1-1;
    else if(s1!=-1&&nums[s1+1]==target)
    s2=s1+1;
    }
       ans[0]=Math.min(s1,s2);
       ans[1]=Math.max(s1,s2);
       return ans;
    }
    public int bs(int[] arr,int l,int r,int k,int ans,int mi){
      while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k&&mid!=mi){
                mi=mid;
                ans=mid;
                
            }
            else if(arr[mid]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}