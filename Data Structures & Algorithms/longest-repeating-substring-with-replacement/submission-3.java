class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int j = 0;
        int[] arr = new int[26];
        int maxFreq = 0;

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(i) - 'A']);
            
            while((i - j) + 1 - maxFreq > k) {
                arr[s.charAt(j) - 'A']--;
                j++;
            }
            res = Math.max(res, (i - j) + 1);
        }

        return res;
    }
}