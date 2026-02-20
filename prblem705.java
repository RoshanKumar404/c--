import java.util.LinkedList;

public class prblem705 {
    private final int MAX_LEN = 1000; // Number of buckets
    private LinkedList<Integer>[] set;

    public MyHashSet() {
        set = new LinkedList[MAX_LEN];
    }

    private int getHash(int key) {
        return key % MAX_LEN;
    }

    public void add(int key) {
        int index = getHash(key);
        if (set[index] == null) {
            set[index] = new LinkedList<>();
        }
        if (!set[index].contains(key)) {
            set[index].add(key);
        }
    }

    public void remove(int key) {
        int index = getHash(key);
        if (set[index] != null) {
            // We use Integer.valueOf(key) to ensure we remove the object, 
            // not the element at a specific index.
            set[index].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = getHash(key);
        return set[index] != null && set[index].contains(key);
    }
    
}
