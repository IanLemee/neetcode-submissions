class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0 && !res.contains(List.of(nums[i], nums[left], nums[right]))) {
                    res.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
