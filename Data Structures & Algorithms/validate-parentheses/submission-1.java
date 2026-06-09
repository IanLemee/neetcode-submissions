class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');


        for(char ch : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == map.get(ch)) {
               st.pop();
            }else {
            st.push(ch);
            }
            
        }

        return st.isEmpty();
    }
}
