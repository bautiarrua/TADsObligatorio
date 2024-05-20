import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;

import adt.stack.MyStack;
import org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class Prueba {

    public void lista(){

    }
    public void stack(){
        MyStack<Integer> pruebaStack = new MyLinkedListImpl<>();
        pruebaStack.push(3);
        pruebaStack.push(7);
        pruebaStack.pop();
        resultado = pruebaStack.peek();
        assertEquals(3,resultado);


    }
    public void queue(){

    }
    public void arbol(){

    }
    public void hash(){

    }
}

