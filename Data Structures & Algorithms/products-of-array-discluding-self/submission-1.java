class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int k = -1;

        for(int i = 0; i < nums.length; i++) {
            if(k == -1) {
                k++;
                prefix[k] = nums[i];
                continue;
            }
            int res = prefix[k] * nums[i];
            k++;
            prefix[k] = res;
        }

        k = nums.length;

        for(int i = nums.length-1; i >=0 ; i--) {
            if(k == nums.length) {
                k--;
                postfix[k] = nums[i];
                continue;
            }
            int res = postfix[k] * nums[i];
            k--;
            postfix[k] = res;
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                ans[i] = 1 * postfix[i+1];
            } else if(i == nums.length - 1) {
                ans[i] = prefix[i-1] * 1;
            } else {
                ans[i] = prefix[i-1] * postfix[i+1];
            }
        }


        return ans;
    }

}  
