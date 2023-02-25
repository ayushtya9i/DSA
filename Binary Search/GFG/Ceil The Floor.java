//Ceil The Floor


class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        
        Arrays.sort(arr);
        if (x<arr[0]){
            return new Pair(-1, arr[0]);
        }
        if (x>arr[n-1]){
            return new Pair(arr[n-1],-1);
        }
        int f = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int l=0;
        int h=n-1;
       while (l <= h) {
            int mid =(l+h) / 2;
            if (arr[mid] == x) {
                return new Pair(arr[mid], arr[mid]);
            } else if (arr[mid] < x) {
                f = arr[mid];
                l = mid + 1;
            } else {
                c = arr[mid];
                h = mid - 1;
            }
        }
        return new Pair(f,c);
    }
}

