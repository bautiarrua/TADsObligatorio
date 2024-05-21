import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;

import adt.stack.EmptyStackException;
import org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Prueba MiPrueba = new Prueba();
        MiPrueba.stack_push();
        try {
            MiPrueba.stack_pop();
        }catch (EmptyStackException e){};
        MiPrueba.stack_peek();

    }

}