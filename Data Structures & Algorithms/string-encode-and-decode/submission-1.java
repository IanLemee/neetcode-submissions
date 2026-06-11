class Solution {
    Map<String, Integer> map = new HashMap<>();
    List<List<String>> list = new ArrayList<>();
    int index = 0;
    public String encode(List<String> strs) {
        String str = "";
        for(String string : strs) {
            str += string;
        }
        String key = String.valueOf(Objects.hash());
        map.put(key, index++);
        list.add(strs);
        return key;
    }

    public List<String> decode(String str) {
        return list.get(map.get(str));
    }
}
