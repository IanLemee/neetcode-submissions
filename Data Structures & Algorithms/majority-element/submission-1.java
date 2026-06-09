class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int majority = 0;

        for(int i = 0; i < nums.length; i++) {
            if(majority == 0) {
                ans = nums[i];
            } 

            majority += (nums[i] == ans) ? 1 : -1;
        }

        return ans;
    }
}