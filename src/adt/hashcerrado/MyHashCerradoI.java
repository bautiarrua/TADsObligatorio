package adt.hashcerrado;

import adt.Exceptions.NoEsta;
import adt.linkedlist.MyLinkedListImpl;

public interface MyHashCerradoI<K, V> {

    void put(K key, V value);

    V get(K key) throws NoEsta;

    Boolean contains(K key);

    void remove (K key) throws NoEsta;

    MyLinkedListImpl<K> Keys();

    MyLinkedListImpl<V> Values();

    int size();

}