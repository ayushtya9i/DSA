// 74. Search a 2D Matrix




class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int h=n*m-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid/m][mid%m]==target)
            return true;
            if(matrix[mid/m][mid%m]<target)
            l=mid+1;
            else
            h=mid-1;
        }
        return false;
    }
}