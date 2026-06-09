class Solution {
     public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        callRec(nums, target, result, new ArrayList(), 0);
        return result;
    }

    private static void callRec(int[] nums, int target, List<List<Integer>> res, List<Integer> temp, int i) {
        if(temp.stream().mapToInt(val -> val).sum() == target) {
            res.add(new ArrayList<>(temp));
            return;
        }

        
        if(i > nums.length-1 || temp.stream().mapToInt(val -> val).sum() > target) {
            return;
        }

            temp.add(nums[i]);
            callRec(nums, target, res, temp, i);
            temp.removeLast();
            callRec(nums, target, res, temp, i+1);

    }
}
