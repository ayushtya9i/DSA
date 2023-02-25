//Number of occurrence



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        int l=sbs(arr,0,n-1,x,-1);
        int r=lbs(arr,0,n-1,x,-1);
        if(l==-1||r==-1){
            return 0;
        }
        return r-l+1;
        
    }
    int sbs(int[] arr,int l,int r,int x,int ans){
        
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]>x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
      int lbs(int[] arr,int l,int r,int x,int ans){
        
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]<=x){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
}