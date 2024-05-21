import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.linkedlist.MyLinkedListImpl;
import adt.linkedlist.MyList;
import adt.queue.EmptyQueueException;
import adt.queue.MyQueue;
import adt.stack.EmptyStackException;
import adt.stack.MyStack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void linkedlist_size() {
        MyLinkedListImpl<Integer> list = new MyLinkedListImpl<>();
        assertEquals(0, list.size());
        list.add(200);
        assertEquals(1, list.size());
    }
    @Test
    public void linkedlist_contains() {
        MyLinkedListImpl<Integer> list = new MyLinkedListImpl<>();
        list.add(20);
        assertEquals(1, list.size());
        assertEquals(true,list.contains(20));
    }
    @Test
    public void linkedlist_add(){
        MyLinkedListImpl<Integer> lista = new MyLinkedListImpl<>();
        lista.add(200);
        lista.add(300);
        assertEquals(2,lista.size());
        assertEquals(300,lista.get(1));
        assertEquals(true,lista.contains(200));
        assertEquals(true,lista.contains(300));

    }
    @Test
    public void linkedlist_remove(){
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

    @Test
    public void arbol_contains(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(1);
        assertEquals(true,arbol.contains(1));
    }
    @Test
    public void arbol_add(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(1);
        assertEquals(true,arbol.contains(1));
    }
    @Test
    public void arbol_find(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(1);
        assertEquals(true,arbol.contains(1));
        assertEquals(1,arbol.find(1));
    }
    @Test
    public void arbol_remove(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(1);
        arbol.add(2);
        assertEquals(true,arbol.contains(2));
        arbol.remove(2);
        assertEquals(false,arbol.contains(2));
    }

    @Test
    public void arbol_inOeder(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(2);
        arbol.add(3);
        arbol.add(1);
        arbol.add(4);
        arbol.add(5);
        List<Integer> iO = arbol.inOrder();
        assertEquals(1,iO.get(0));
        assertEquals(2,iO.get(1));
        assertEquals(3,iO.get(2));
        assertEquals(4,iO.get(3));
        assertEquals(5,iO.get(4));
    }
    @Test
    public void arbol_postOeder(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(4);
        arbol.add(2);
        arbol.add(3);
        arbol.add(1);
        arbol.add(6);
        arbol.add(5);
        arbol.add(7);
        List<Integer> P = arbol.postOrder();
        assertEquals(1,P.get(0));
        assertEquals(3,P.get(1));
        assertEquals(2,P.get(2));
        assertEquals(5,P.get(3));
        assertEquals(7,P.get(4));
        assertEquals(6,P.get(5));
        assertEquals(4,P.get(6));
    }
    @Test
    public void arbol_preOeder(){
        BinaryTree<Integer> arbol = new SearchBinaryTreeImpl<>();
        arbol.add(4);
        arbol.add(2);
        arbol.add(3);
        arbol.add(1);
        arbol.add(6);
        arbol.add(5);
        arbol.add(7);
        List<Integer> p = arbol.preOrder();
        assertEquals(4,p.get(0));
        assertEquals(2,p.get(1));
        assertEquals(1,p.get(2));
        assertEquals(3,p.get(3));
        assertEquals(6,p.get(4));
        assertEquals(5,p.get(5));
        assertEquals(7,p.get(6));
    }







}

