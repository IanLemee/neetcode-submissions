class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream().filter(n -> n.getValue() > nums.length / 3)
                .map(Map.Entry::getKey)
                .toList();
    }
}