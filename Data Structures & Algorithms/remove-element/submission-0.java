class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        Arrays.sort(nums);
        int l = 0;
        int r = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                l = i;
                r = l;
                while(r < nums.length && nums[r] == val) {
                    r++;
                }
                swap(nums, l, r);
                break;
            }
        }

        while(res < nums.length && nums[res] != val) {
            res++;
        }
        return res;
    }

    private void swap(int[] nums, int left, int right) {
        int n = nums.length - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[n];
            nums[n] = temp;
            left++;
            n--;
        }
    }
}