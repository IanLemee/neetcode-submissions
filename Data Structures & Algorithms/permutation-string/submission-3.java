class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int n = s2.length();
        int m = s1.length();
        for(int j = 0; j < n; j++) {
            if((j+ 1) - i < m) continue;
            int k = 0;
            String str = s2.substring(i, j + 1);
            Map<Character, Integer> map = new HashMap<>();
            while(k < str.length()) {
                char ch = str.charAt(k);
                map.put(ch, map.getOrDefault(ch, 0) +1);
                k++;
            }
            if(permutation(map, s1)) return true;
            i++;
        }

        return false;
    }

    private boolean permutation(Map<Character, Integer> map, String s) {
        for(char ch : s.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch) <= 0) return false;
            map.put(ch, map.get(ch) -1);
        }

        return true;
    }
}
