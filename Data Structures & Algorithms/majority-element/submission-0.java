class Solution {
    public int majorityElement(int[] nums) {
        int ans = -1;
        int n = nums.length;
        int x = n / 2;

        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > x) {
                ans = nums[i];
            }
        }

        return ans;
    }
}