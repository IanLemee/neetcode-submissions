class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        // int leftSearch = binarySearch(nums,0, pivot);
        // int rightSearch = binarySearch(nums, pivot+1, nums.length);
        return (nums[0] < nums[pivot+1]) ? nums[0] : nums[pivot+1];
    }

    private int binarySearch(int[] arr, int start, int end) {
        int mid = 0;

        while(start < end) {
             mid = (end + start) /2;

            if(arr[mid] > arr[start]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return arr[mid];
    }

    private int findPivot(int[] a) {
        int start = 0;
        int end = a.length-1;
        while(start < end ) {
         int mid = (end + start) / 2;

            if(mid > start && a[mid] < a[mid-1]) {
            return mid-1;
        }else if(mid < end && a[mid] > a[mid+1] ) {
            return mid;
        } 
        
        if(mid > start && a[mid] > a[start] && a[mid] > a[mid-1]) {
            start = mid +1;
        } else {
            end = mid-1;
        }
        }
        
        return -1;
    }
}
