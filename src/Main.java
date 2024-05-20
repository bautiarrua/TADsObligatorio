import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;

import org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Arbolbinario<Integer, Integer> oTree = new Arbolbinario<>();

        oTree.add(3, 3);
        System.out.println("Se agrego 3");
        oTree.add(21, 21);
        System.out.println("Se agrego 21");
        oTree.add(11, 11);
        System.out.println("Se agrego 11");
        oTree.add(-1, -1);
        System.out.println("Se agrego -1");
        oTree.add(4, 4);
        System.out.println("Se agrego 4");
        oTree.add(18, 18);
        System.out.println("Se agrego 18");

        MyList<Integer> ls = oTree.inOrder();
        for(int i = 0; i<ls.size(); i++){
            System.out.println(ls.get(i));
        }
    }

}