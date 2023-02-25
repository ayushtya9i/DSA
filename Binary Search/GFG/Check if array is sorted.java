//Check if array is sorted




class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
      return arraySortedOrNot(arr,0,n);
    }
    boolean arraySortedOrNot(int[] arr, int si,int n) {
      if(si>=arr.length-1)
      return true;
      if(arr[si]>arr[si+1])
      return false;
      return arraySortedOrNot(arr,si+1,n);
    }
}