package adt.hashcerrado;

import adt.Exceptions.NoEsta;
import adt.arbolbinario.TreeNode;
import adt.linkedlist.MyLinkedListImpl;

import java.security.Key;
import java.util.ArrayList;

public class MyHashCerrado<K,V> implements MyHashCerradoI<K,V> {
    private static class Entry<K, V> {
        K key;
        V value;
        boolean deleted;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public boolean isDeleted() {
            return deleted;
        }

        public void setDeleted(boolean deleted) {
            this.deleted = deleted;
        }

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }

    private int capacityd = 16;
    private double FactorDeCarga = 0.75;

    private Entry<K, V>[] table;
    private int capacity;

    public MyHashCerrado() {
        this.capacity = capacityd;
        this.table = new Entry[capacity];
    }

    int size = 0;

    private int hash(K key) {
        return key.hashCode();
    }
    public void put(K key, V value) {
        boolean com = false;
        if(size/capacity>=FactorDeCarga){
            //resize();
        }
        else{
            int indice = hash(key)%capacity;
            Entry<K,V> nuevo = new Entry<>(key,value);
            while (com == false) {
                if (table[indice] == null) {
                    table[indice] = nuevo;
                    com = true;
                    size = size +1;
                } else if(table[indice] != null && table[indice].isDeleted()){
                    table[indice] = nuevo;
                    com = true;
                    size = size +1;
                }
                else {
                    indice = (hash(key) + 1) % capacity;
                }
            }
        }

    }

    public V get(K key) throws NoEsta{
        int indice = hash(key)%capacity;
        int cont = 0;
        while (table[indice].getKey() != key){
            indice = indice +1;
            cont = cont +1;
            if(cont>capacity){
                throw new NoEsta();
            }
        }
        if(table[indice].isDeleted()){
            throw new NoEsta();
        }else {
            return table[indice].getValue();
        }
    }

    public Boolean contains(K key) {
        int indice = hash(key)%capacity;
        int cont = 0;
        while (table[indice].getKey() != key) {
            indice = indice + 1;
            cont = cont + 1;
            if (cont > capacity) {
                return false;
            }
        }
        if (table[indice].isDeleted()) {
            return false;
        } else {
            return true;
        }
    }

    public void remove(K key) throws NoEsta {
        int indice = hash(key)%capacity;
        int cont = 0;
        while (table[indice].getKey() != key){
            indice = indice +1;
            cont = cont +1;
            if(cont>capacity){
                throw new NoEsta();
            }
        }
        table[indice].setDeleted(true);
        size = size -1;
    }

    public MyLinkedListImpl<K> Keys() {
        return null;
    }

    public MyLinkedListImpl<V> Values() {
        return null;
    }

    public int size(){
        return size;
    }
}
