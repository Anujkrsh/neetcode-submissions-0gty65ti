class MyHashMap {
    private final int size =769;
    private LinkedList<Entry>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[size];
        for(int i=0;i<size;i++){
            buckets[i]= new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int ind= key% size;
        LinkedList<Entry> bucket = buckets[ind];

        for(Entry e : bucket){
            if(e.getKey()==key){
                e.setValue(value);
                return;
            }
        }
        bucket.add(new Entry(key,value));
    }
    
    public int get(int key) {
        int ind= key% size;
        LinkedList<Entry> bucket = buckets[ind];

        for(Entry e : bucket){
            if(e.getKey()==key){
                return e.getValue();
            }
        }
        return -1;
    }
    
    public void remove(int key) {
                int ind= key% size;
        LinkedList<Entry> bucket = buckets[ind];

        for(Entry e : bucket){
            if(e.getKey()==key){
                bucket.remove(e);
            }
        }
    }

}

public class Entry{
    private int key;
    private int value;

        public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */