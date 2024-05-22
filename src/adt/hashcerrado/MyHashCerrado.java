package adt.hashcerrado;

import adt.arbolbinario.TreeNode;
import adt.linkedlist.MyLinkedListImpl;

import java.security.Key;
import java.util.ArrayList;

public class MyHashCerrado<K,V> implements MyHashCerradoI<K,V> {
    private static class Entry<K, V> {
        K key;
        V value;
        boolean deleted;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }
    private static final int capacityd = 16;
    private static final double FactorDeCarga = 0.75;


    private Entry<K, V>[] table;
    private int size;
    private int capacity;

    public MyHashCerrado() {
        this.capacity = capacityd;
        this.table = new Entry[capacity];
        this.size = 0;
    }

    private int hash(K key) {
        return key.hashCode();
    }
    public void put(K key, V value) {
        boolean com = false;
        if(size/capacity>=FactorDeCarga){
            //resize();
        }
        else{
            int indice =  hash(key)%capacity;
            Entry<K,V> nuevo = new Entry<>(key,value);
            while (!com) {
                if (table[indice] != null || table[indice].deleted) {
                    table[indice] = nuevo;
                    com = true;
                } else {
                    indice = (hash(key) + 1) % capacity;
                }
            }
        }

    }

    public V get(K key) {
        return null;
    }

    public Boolean contains(K key) {
        return null;
    }

    public void remove(K key) {

    }

    public MyLinkedListImpl<K> Keys() {
        return null;
    }

    public MyLinkedListImpl<V> Values() {
        return null;
    }

    public int size() {
        return 0;
    }
}
