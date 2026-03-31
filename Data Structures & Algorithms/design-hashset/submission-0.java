class MyHashSet {

    private final int size= 769;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets= new LinkedList[size];
        for(int i=0;i<size;i++){
            buckets[i]= new LinkedList<>();
        }
        
    }
    
    public void add(int key) {
    int index= key% size;
    LinkedList<Integer> bucket= buckets[index];

    if(!bucket.contains(key)){
        bucket.add(key);
    }    
    }
    
    public void remove(int key) {
    int index= key % size;
    LinkedList<Integer> bucket= buckets[index];

    bucket.remove((Integer)key);
    }
    
    public boolean contains(int key) {
    int index= key% size;
    LinkedList<Integer> bucket= buckets[index];

    return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */