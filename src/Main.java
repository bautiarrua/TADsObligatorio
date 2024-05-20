import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;
public class Main {
    public static void main(String[] args) {
        Arbolbinario<Integer, String> Arbol = new Arbolbinario<>();

        Arbol.add(3, "Raiz");
        Arbol.add(21, "Hola");
        Arbol.add(11, "11");
        Arbol.add(-1, "-1");
        Arbol.add(4, "cuatro");
        Arbol.add(18, "18");
        Arbol.add(2, "2");
        System.out.println(Arbol.find(21));
        MyList<Integer> ls = Arbol.preOrder();
        for(int i = 0; i<ls.size(); i++){
            System.out.println(ls.get(i));
        }
    }

}