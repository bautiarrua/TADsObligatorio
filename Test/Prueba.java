import adt.arbolbinario.Arbolbinario;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.linkedlist.Node;
import adt.queue.EmptyQueueException;
import adt.queue.MyQueue;
import adt.stack.EmptyStackException;
import adt.stack.MyStack;

import org.junit.Before;
import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {
    @Test
    public void Stack_size() {
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        assertEquals(0, stack.size());
        stack.push(20);
        assertEquals(1, stack.size());
    }
    @Test
    public void stack_push(){
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
    }
    @Test
    public void stack_pop() throws EmptyStackException{
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(1,stack.size());
        stack.pop();
        assertEquals(0,stack.size());
    }
    @Test
    public void stack_peek(){
        MyStack<Integer> stack = new MyLinkedListImpl<>();
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
        assertEquals(Integer.valueOf(3),stack.peek());
    }
    @Test
    public void linked_list_size() {
        MyLinkedListImpl<Integer> list = new MyLinkedListImpl<>();
        assertEquals(0, list.size());
        list.add(200);
        assertEquals(1, list.size());
    }
    @Test
    public void linked_list_contains() {
        MyLinkedListImpl<Integer> list = new MyLinkedListImpl<>();
        list.add(20);
        assertEquals(1, list.size());
        assertEquals(true,list.contains(20));
    }
    @Test
    public void linked_list_add(){
        MyLinkedListImpl<Integer> lista = new MyLinkedListImpl<>();
        lista.add(200);
        lista.add(300);
        assertEquals(2,lista.size());
        assertEquals(300,lista.get(1));
        assertEquals(true,lista.contains(200));
        assertEquals(true,lista.contains(300));

    }
    @Test
    public void linked_list_remove(){
        MyLinkedListImpl<Integer> lista = new MyLinkedListImpl<>();
        lista.add(200);
        lista.add(300);
        assertEquals(2,lista.size());
        lista.remove(200);
        assertEquals(1,lista.size());
        assertEquals(300,lista.get(0));
        assertEquals(true,lista.contains(300));
        assertEquals(false,lista.contains(200));
    }
    @Test
    public void queue_size(){
        MyQueue<Integer> queue = new MyLinkedListImpl<>();
        assertEquals(0,queue.size());
        queue.enqueue(3);
        assertEquals(1,queue.size());
    }
    @Test
    public void queue_contains() {
        MyQueue<Integer> queue = new MyLinkedListImpl<>();
        queue.enqueue(20);
        assertEquals(1, queue.size());
        assertEquals(true,queue.contains(20));
    }
    @Test
    public void queue_enqueue(){
        MyQueue<Integer> queue = new MyLinkedListImpl<>();
        queue.enqueue(3);
        assertEquals(1,queue.size());
        assertEquals(true,queue.contains(3));
    }
    @Test
    public void queue_denqueue() throws EmptyQueueException {
        MyQueue<Integer> queue = new MyLinkedListImpl<>();
        queue.enqueue(3);
        assertEquals(1,queue.size());
        assertEquals(true,queue.contains(3));
        queue.dequeue();
        assertEquals(0,queue.size());
        assertEquals(false,queue.contains(3));

    }



}

