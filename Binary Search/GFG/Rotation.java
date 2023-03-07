// Rotation


class Solution {
    int findKRotation(int nums[], int n) {
        // code here
        int l=0;
     
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