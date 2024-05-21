import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;
import adt.stack.EmptyStackException;
import adt.stack.MyStack;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class Prueba {

    public void testSizeEmptyStack() {
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        assertEquals(0, stack.size());
    }

    public void stack_push(){
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
    }
    public void stack_pop() throws EmptyStackException{
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(1,stack.size());
        stack.pop();
        assertEquals(0,stack.size());
    }
    public void stack_peek(){
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
        assertEquals(Integer.valueOf(3),stack.peek());
    }


}

