class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        String res = "";
        int count = 0;
        int j = 0;

        for(char ch: t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(tMap.containsKey(ch)) {
                sMap.put(ch, sMap.getOrDefault(ch, 0)+1);
                if (sMap.get(ch) <= tMap.get(ch)) count++;
            }

            while(count == t.length()) {
                if(res.equals("") || s.substring(j,i+1).length() < res.length()) {
                    res = s.substring(j,i+1);
                }
                if(tMap.containsKey(s.charAt(j))) {
                    if (sMap.get(s.charAt(j)).equals(tMap.get(s.charAt(j)))) count--;
                    sMap.put(s.charAt(j), sMap.get(s.charAt(j)) -1);
                }
                j++;
            }
        }
        
        return res;
    }
}