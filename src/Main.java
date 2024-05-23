import adt.Exceptions.NoEsta;
import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.hashcerrado.HashCerrado;
import adt.hashcerrado.MyHashCerrado;
import adt.hashcerrado.MyHashCerradoI;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyHashCerradoI<Integer,Integer> hash = new MyHashCerrado<>();
        hash.put(100,100);
        System.out.println(hash.size());
        try {
            System.out.println(hash.get(100));
        }catch (NoEsta e){}
        }
    }

