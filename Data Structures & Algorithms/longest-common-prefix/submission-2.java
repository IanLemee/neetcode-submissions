class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i = 1; i < strs.length; i++) {
            String str = strs[i];
            int dummy = 0;
            int n = (ans.length() < str.length()) ? ans.length() : str.length();
            while (dummy < n && str.charAt(dummy) == ans.charAt(dummy)) {
                dummy++;
            }
            if(dummy == 0) return "";
            if (ans != str.substring(0, dummy)) {
                ans = str.substring(0, dummy);
            }
        }

        return ans;
    }
}