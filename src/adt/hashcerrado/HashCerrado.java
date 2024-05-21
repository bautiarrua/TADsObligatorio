package adt.hashcerrado;
import adt.hashcerrado.MyHashCerrado;
import adt.linkedlist.MyLinkedListImpl;

public class HashCerrado<K,V> implements MyHashCerradoI<K,V> {

    public HashCerrado() {
        Object [] hashTable = new Object[100];
    }

    @Override
    public void put(K k, V v) {

    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public Boolean contains(K k) {
        return null;
    }

    @Override
    public void remuve(K k) {

    }

    @Override
    public MyLinkedListImpl<K> Keys() {
        return null;
    }

    @Override
    public MyLinkedListImpl<V> Values() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
