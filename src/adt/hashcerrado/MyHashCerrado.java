package adt.hashcerrado;

import adt.Exceptions.NoEsta;
import adt.linkedlist.MyLinkedListImpl;


public class MyHashCerrado<K,V> implements MyHashCerradoI<K,V> {

    private int capacityd = 16;
    final double FactorDeCarga = 0.75;
    private Entry<K, V>[] table;
    MyLinkedListImpl<K> keys = new MyLinkedListImpl<>();
    MyLinkedListImpl<V> values = new MyLinkedListImpl<>();
    private int capacity;
    int size = 0;

    public MyHashCerrado() {
        this.capacity = capacityd;
        this.table = new Entry[capacity];
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
            int indice = hash(key)%capacity;
            Entry<K,V> nuevo = new Entry<>(key,value);
            while (!com) {
                if (table[indice] == null || table[indice].isDeleted()) {
                    table[indice] = nuevo;
                    com = true;
                    size = size +1;
                    keys.add(key);
                    values.add(value);

                } else {
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
            if(cont > capacity){
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
        size = size - 1;
        K keyTemp = table[indice].getKey();
        V valueTemp = table[indice].getValue();
        keys.remove(keyTemp);
        values.remove(valueTemp);
    }

    public MyLinkedListImpl<K> Keys() {

        return keys;
    }

    public MyLinkedListImpl<V> Values() {
        return values;
    }

    public int size(){
        return size;
    }
}
