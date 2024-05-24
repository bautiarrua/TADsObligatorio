import adt.Exceptions.NoEsta;
import adt.Exceptions.YaExiste;
import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.hashcerrado.MyHashCerrado;
import adt.hashcerrado.MyHashCerradoI;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyHashCerrado<Integer,Integer> hash = new MyHashCerrado<>();
        try {
            hash.put(10,10);
            hash.put(26,26);
            hash.put(27,27);
            hash.put(42,42);
        }catch (YaExiste e){}
        try {
            hash.remove(10);
            System.out.println(hash.indice(26));
            System.out.println(hash.indice(27));
            System.out.println(hash.indice(42));
        }catch (NoEsta e){}
        System.out.println(hash.contains(10));

    }
}

