class Solution {
     public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;

        while (left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            if(lChar != rChar) {
                return isPalindrome(s, left+1, right) || isPalindrome(s, left,  right-1);
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            char lChar = s.charAt(left);
            char rChar = s.charAt(right);
            if(lChar != rChar) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}