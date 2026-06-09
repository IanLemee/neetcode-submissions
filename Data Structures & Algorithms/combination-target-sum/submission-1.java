class Solution {
     List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        backtracking(0, target, candidates, new ArrayList<>());
        return res;
    }

    public void backtracking(int i, int target, int[] candidates, List<Integer> temp) {
        if(temp.stream().mapToInt(v -> v).sum() == target) {
            res.add(new ArrayList(temp));
            return;
        }

        if(i > candidates.length - 1 || temp.stream().mapToInt(v -> v).sum() > target) return;

        temp.add(candidates[i]);
        backtracking(i, target, candidates, temp);
        temp.removeLast();
        backtracking(i+1, target, candidates, temp);
    }
}
