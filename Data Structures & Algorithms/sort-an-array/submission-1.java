class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;
    }

    private void quicksort(int[] nums, int left, int right) {
       if (left < right) {
            int k = partition(nums, left, right);
            quicksort(nums, left, k-1);
            quicksort(nums, k+1, right);
       }
    }

    private int partition(int[] nums, int left, int right) {
        int l = left;
        int r = right;

        int pivot = nums[left];

        while(l < r) {

            while(l < nums.length && nums[l] <= pivot) {
                l++;
            }
            while(r > 0 && nums[r] > pivot) {
                r--;
            }

            if(l < r) {
                swap(nums, l, r);
                l++;
                r--;
            }
        }
        swap(nums, left, r);
        return r;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}