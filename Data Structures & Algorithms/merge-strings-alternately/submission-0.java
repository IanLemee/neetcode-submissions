class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s = 0; 
        int e = 0;
        StringBuilder sb = new StringBuilder();
        while(s < word1.length() && e < word2.length()) {
            sb.append(word1.charAt(s++));
            sb.append(word2.charAt(e++));
        }

        String str = (s < word1.length()) ? word1.substring(s) : word2.substring(e);
        sb.append(str);
        return sb.toString();
    }
}