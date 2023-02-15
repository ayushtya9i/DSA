//Floor in a Sorted Array

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    
    {
        if(x<arr[0])
        return -1;
        return bs(arr,0,n-1,x,0);
    }
    static int bs(long[] arr,int l,int r,long x,int ans){
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]<=x){
            ans=mid;
            l=mid+1;
             }
            else if(arr[mid]>x)
            r=mid-1;
           
        }
        return ans;
    }
}