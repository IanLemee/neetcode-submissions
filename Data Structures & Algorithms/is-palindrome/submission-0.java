class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\W", "");
        int start = 0;
        int end = s.length() -1;
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
