class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length-1);
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
                swapaa(nums, l, r);
                
            }
        }
        swapaa(nums, left, r);
        return r;
    }

    private static void swapaa(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}