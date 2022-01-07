class Solution {
    public int search(int a[], int key) {
        int low = 0, high= a.length-1;
        while (low <= high) {
            int mid =(low+high)/2;
            if (a [mid] == key) {
                return mid;
            }
            else if (key > a[mid]) {
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

//  https://www.youtube.com/watch?v=ApvI7QUqGzI
