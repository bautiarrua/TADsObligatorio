import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.linkedlist.MyList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(4);
        arbol.add(2);
        arbol.add(3);
        arbol.add(1);
        arbol.add(6);
        arbol.add(5);
        arbol.add(7);
        arbol.remove(7);
        List<Integer> list = arbol.postOrder();
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

}