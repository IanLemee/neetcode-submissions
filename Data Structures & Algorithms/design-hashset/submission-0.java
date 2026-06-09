class MyHashSet {
    int[] set = new int[1_000_001];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(this.set[key] != 0) return;
        this.set[key] = key;
    }
    
    public void remove(int key) {
      if(this.set[key] == 0) return;
        this.set[key] = 0;
    }
    
    public boolean contains(int key) {
        return this.set[key] != 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */