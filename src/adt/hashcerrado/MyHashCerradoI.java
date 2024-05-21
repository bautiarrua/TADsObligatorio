package adt.hashcerrado;

import adt.linkedlist.MyLinkedListImpl;

public interface MyHashCerradoI<Key, Value> {

    void put(Key key, Value value);

    Value get(Key key);

    Boolean contains(Key key);

    void remuve (Key key);

    MyLinkedListImpl<Key> Keys();

    MyLinkedListImpl<Value> Values();

    int size();

}