class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            int[] aux = new int[nums.length - i];
            int x = 0;
            for(int j = i; j < nums.length; j++) {
                if(j == i) {
                    aux[x] = nums[j];
                    continue;
                }
                int val = aux[x] + nums[j];
                aux[++x] = val;
            }

            for(int num : aux) {
                if(num == k) res++;
            }
        }
        
        return res;
    }
}