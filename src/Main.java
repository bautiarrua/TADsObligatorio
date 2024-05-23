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
        }catch (YaExiste e){}
        try {
            hash.put(42,42);
        }catch (YaExiste e){System.out.println("YA EXISTE");}
        System.out.println(hash.size());
        System.out.println(hash.contains(10));
        System.out.println(hash.contains(26));
        System.out.println(hash.contains(42));


    }
}

