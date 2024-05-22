package adt.hashcerrado;
import adt.linkedlist.MyLinkedListImpl;
import com.sun.jdi.Value;

import java.util.HashMap;

public class HashCerrado<K,V> implements MyHashCerradoI<K,V> {
    private HashMap<K, V> map = null;

    public HashCerrado() {
        map = new HashMap<K, V>();
    }

//    public MyHashImpl(int initialCapacity) {
//        map = new HashMap<K, V>(initialCapacity);
//    }


    @Override
    public MyLinkedListImpl<K> Keys() {
        MyLinkedListImpl<K> toReturn = new MyLinkedListImpl<>();

        map.keySet().stream().forEach(s -> toReturn.add(s));

        return toReturn;
    }

    @Override
    public MyLinkedListImpl<V> Values() {
        MyLinkedListImpl<V> toReturn = new MyLinkedListImpl<>();

        map.values().stream().forEach(s -> toReturn.add(s));

        return toReturn;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public Boolean contains(K key) {
        return map.containsKey(key);
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

}
