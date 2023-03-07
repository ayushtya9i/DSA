
// Search insert position of K in a sorted array


class Solution
{
    static int searchInsertK(int arr[], int n, int k)
    {
        // code here
        if(k<=arr[0]){
            return 0;
        }
        if(k>arr[n-1]){
            return n;
        }
        
        int f=Integer.MIN_VALUE;
        int c=Integer.MAX_VALUE;    
        
        int l=0;
        int h=n-1;
       while (l <= h) {
            int mid =(l+h) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                f = mid;
                l = mid + 1;
            } else {
                c = mid;
                h = mid - 1;
            }
       }
        if(f<0)
        return 0;  
        return f+1;
        
    }
    
}