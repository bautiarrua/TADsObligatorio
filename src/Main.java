import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.hashcerrado.HashCerrado;
import adt.hashcerrado.MyHashCerradoI;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyHashCerradoI<Integer,Integer> hash = new HashCerrado<>();
        hash.put(10,100);
        hash.put(4,40);
        hash.put(20,200);
        hash.put(15,150);
        hash.put(2,20);
        hash.put(1,10);
        MyLinkedListImpl<Integer> Kl = hash.Keys();
        for(int i = 0;i< Kl.size();i++){
            System.out.println(Kl.get(i));
        }
    }

}