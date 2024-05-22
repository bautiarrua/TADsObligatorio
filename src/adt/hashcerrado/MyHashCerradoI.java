package adt.hashcerrado;

import adt.linkedlist.MyLinkedListImpl;

public interface MyHashCerradoI<K, V> {

    void put(K key, V value);

    V get(K key);

    Boolean contains(K key);

    void remove (K key);

    MyLinkedListImpl<K> Keys();

    MyLinkedListImpl<V> Values();

    int size();

}