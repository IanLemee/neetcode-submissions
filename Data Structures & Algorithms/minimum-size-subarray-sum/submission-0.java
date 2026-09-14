class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        List<Integer> minLen = new ArrayList<>();

        int sum = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                minLen.add((j - i) + 1);
                sum -= nums[i++];
            }
        }
        System.out.println(minLen);
        return minLen
        .stream()
        .mapToInt(v -> v)
        .min()
        .orElse(0);
    }
}