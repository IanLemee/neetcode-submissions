class PrefixTree {
    private Node root;

    public PrefixTree() {
        if (root == null)
            this.root = new Node();
    }

    public void insert(String str) {
        Node temp = root;
        int i = 0;
        while (i< str.length() && temp.map.containsKey(str.toCharArray()[i])) {
            temp =  temp.map.get(str.toCharArray()[i]);
            i++;
        }
        for (int j = i; j < str.length(); j++){
            char ch = str.charAt(j);
            temp.map.put(ch, new Node());
            temp = temp.map.get(ch);

        }
        temp.isCompleteWord = true;
    }

    public boolean search(String word) {
        Node temp = root;
        int i = 0;
        while(i < word.length() && temp.map.containsKey(word.charAt(i))) {
            temp = temp.map.get(word.charAt(i));
            i++;
        }

        return i >= word.length() && temp.isCompleteWord;
    }

    public boolean startsWith(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            if (!temp.map.containsKey(word.charAt(i))) return false;
            temp = temp.map.get(word.charAt(i));
        }

        return true;
    }

    private class Node {
        private Map<Character, Node> map;
        private boolean isCompleteWord;

        public Node() {
            this.map = new HashMap<>();
        }

        public Node(Map<Character, Node> map) {
            this.map = map;
        }

        public Node(Map<Character, Node> map, boolean isCompleteWord) {
            this.map = map;
            this.isCompleteWord = isCompleteWord;
        }

        public Node(boolean isCompleteWord) {
            this.isCompleteWord = isCompleteWord;
        }
    }
}
