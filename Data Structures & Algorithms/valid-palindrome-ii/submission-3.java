class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

       while(start < end) {
        if(s.charAt(start) != s.charAt(end)) {
            String skipS = s.substring(start+1, end+1);
            String skipE = s.substring(start, end);

            String reversedS = new StringBuilder(skipS).reverse().toString();
            String reversedE = new StringBuilder(skipE).reverse().toString();

            if(!skipS.equals(reversedS) && !skipE.equals(reversedE)) {
                return false;
            }
        }
        start++;
        end--;
       }

        return true; 
    }
}