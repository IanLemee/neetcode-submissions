class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) return true;

        for(int i = 0; i < s.length(); i++) {
            sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++) {
                if(j == i) continue;
                sb.append(s.charAt(j));
            }
            String str = sb.toString();
            if(str.equals(sb.reverse().toString())) return true;;
        }
        return false; 
    }
}