class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, 0);
        }

        int a = 1;
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(a)) {
                return a;
            }
            a++;
        }

        return nums.length+1;
    }
}