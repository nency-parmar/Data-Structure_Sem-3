import java.util.LinkedList;
class HashNode<K, V> 
{
    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(K key, V value) 
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
class HashTable<K, V> 
{
    private LinkedList<HashNode<K, V>>[] table;
    private int size;

    public HashTable(int capacity) 
    {
        table = new LinkedList[capacity];
        size = 0;
        for (int i = 0; i < capacity; i++) 
        {
            table[i] = new LinkedList<>();
        }
    }
    private int getHash(K key) 
    {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % table.length);
    }
    public void insert(K key, V value) 
    {
        int index = getHash(key);
        for (HashNode<K, V> node : table[index]) 
        {
            if (node.key.equals(key)) 
            {
                node.value = value;
                return;
            }
        }
        table[index].add(new HashNode<>(key, value));
        size++;
    }
    public V get(K key) 
    {
        int index = getHash(key);
        for (HashNode<K, V> node : table[index]) 
        {
            if (node.key.equals(key)) 
            {
                return node.value;
            }
        }
        return null;
    }
    public V remove(K key) 
    {
        int index = getHash(key);
        for (HashNode<K, V> node : table[index]) 
        {
            if (node.key.equals(key)) 
            {
                V value = node.value;
                table[index].remove(node);
                size--;
                return value;
            }
        }
        return null;
    }
    public int size() 
    {
        return size;
    }
    public boolean isEmpty() 
    {
        return size == 0;
    }
}

public class DictionaryPair 
{
    public static void main(String[] args) 
    {
        HashTable<String, Integer> hashTable = new HashTable<>(10);
        hashTable.insert("abc", 25);
        hashTable.insert("xyz", 30);
        hashTable.insert("qwe", 35);

        System.out.println("abc's age: " + hashTable.get("abc"));
        System.out.println("xyz's age: " + hashTable.get("xyz"));

        hashTable.remove("abc");

        System.out.println("Size of Hash table: " + hashTable.size());
    }
}