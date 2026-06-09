class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> counter = new HashMap();
       
       for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);   
        counter.put(c, counter.getOrDefault(c, 0) +1);
       }

       for(int i = 0; i < t.length(); i++) {
        if(!counter.containsKey(t.charAt(i)) || counter.get(t.charAt(i)) == 0) return false;
        counter.put(t.charAt(i), counter.get(t.charAt(i)) -1);
       }

       return true;
    }
}
