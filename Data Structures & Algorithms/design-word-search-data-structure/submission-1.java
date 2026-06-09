class WordDictionary {
    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node temp = root;
        for(char ch : word.toCharArray()) {
            if(temp.children[ch - 'a'] == null) {
                temp.children[ch - 'a'] = new Node();
            }
            temp = temp.children[ch - 'a'];
        }
        temp.isWord = true;
    }

    public boolean search(String word) {
        Node temp = root;
        return dfs(temp, word, 0);
    }

    private boolean dfs(Node root, String word, int i) {
        if(i == word.length()) return root.isWord;
        char ch = word.charAt(i);
        if(ch == '.') {
            for(Node child : root.children) {
                if(child != null && dfs(child, word.substring(i+1), 0)) return true;
            }
            return false;
        } 
        if(root.children[ch - 'a'] == null) return false;
        root = root.children[ch - 'a'];    

        return dfs(root, word, i+1);
    }

    private class Node {
        Node[] children;
        boolean isWord;

        public Node() {
            this.children = new Node[26];
            this.isWord = false;
        }
    }
}
