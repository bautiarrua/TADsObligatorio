import adt.Exceptions.NoEsta;
import adt.Exceptions.YaExiste;
import adt.arbolbinario.BinaryTree;
import adt.arbolbinario.SearchBinaryTreeImpl;
import adt.hashcerrado.MyHashCerrado;
import adt.hashcerrado.MyHashCerradoI;
import adt.linkedlist.MyLinkedListImpl;
import adt.queue.EmptyQueueException;
import adt.queue.MyQueue;
import adt.stack.EmptyStackException;
import adt.stack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Prueba2 {
    MyStack<Integer> stack;
    MyLinkedListImpl<Integer> lista;
    MyQueue<Integer> queue;
    BinaryTree<Integer> arbol;

    MyHashCerradoI<Integer,Integer> hash;
    @BeforeEach
    public void Before(){
        stack = new MyLinkedListImpl<>();
        lista = new MyLinkedListImpl<>();
        queue = new MyLinkedListImpl<>();
        arbol = new SearchBinaryTreeImpl<>();
        hash = new MyHashCerrado<>();
    }

    @Test
    public void Stack_size() {
        assertEquals(0, stack.size());
        stack.push(20);
        assertEquals(1, stack.size());
    }
    @Test
    public void stack_push(){
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
    }
    @Test
    public void stack_pop() throws EmptyStackException{
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(1,stack.size());
        stack.pop();
        assertEquals(0,stack.size());
    }
    @Test
    public void stack_peek(){
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
        assertEquals(Integer.valueOf(3),stack.peek());
    }
    @Test
    public void linkedlist_size() {
        assertEquals(0, lista.size());
        lista.add(200);
        assertEquals(1, lista.size());
    }
    @Test
    public void linkedlist_contains() {
        lista.add(20);
        assertEquals(1, lista.size());
        assertTrue(lista.contains(20));
    }
    @Test
    public void linkedlist_add(){
        lista.add(200);
        lista.add(300);
        assertEquals(2,lista.size());
        assertEquals(300,lista.get(1));
        assertTrue(lista.contains(200));
        assertTrue(lista.contains(300));
    }
    @Test
    public void linkedlist_remove(){
        lista.add(200);
        lista.add(300);
        assertEquals(2,lista.size());
        lista.remove(200);
        assertEquals(1,lista.size());
        assertEquals(300,lista.get(0));
        assertTrue(lista.contains(300));
        assertFalse(lista.contains(200));
    }
    @Test
    public void queue_size(){
        assertEquals(0,queue.size());
        queue.enqueue(3);
        assertEquals(1,queue.size());
    }
    @Test
    public void queue_contains() {
        queue.enqueue(20);
        assertEquals(1, queue.size());
        assertTrue(queue.contains(20));
    }
    @Test
    public void queue_enqueue(){
        queue.enqueue(3);
        assertEquals(1,queue.size());
        assertTrue(queue.contains(3));
    }
    @Test
    public void queue_denqueue() throws EmptyQueueException {
        MyQueue<Integer> queue = new MyLinkedListImpl<>();
        queue.enqueue(3);
        assertEquals(1,queue.size());
        assertTrue(queue.contains(3));
        queue.dequeue();
        assertEquals(0,queue.size());
        assertFalse(queue.contains(3));

    }

    @Test
    public void arbol_contains(){
        arbol.add(1);
        assertTrue(arbol.contains(1));
    }
    @Test
    public void arbol_add(){
        arbol.add(1);
        assertTrue(arbol.contains(1));
    }
    @Test
    public void arbol_find(){
        arbol.add(1);
        assertTrue(arbol.contains(1));
        assertEquals(1,arbol.find(1));
    }
    @Test
    public void arbol_remove(){
        arbol.add(1);
        arbol.add(2);
        assertTrue(arbol.contains(2));
        arbol.remove(2);
        assertFalse(arbol.contains(2));
    }

    @Test
    public void arbol_inOeder(){
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

    @Test
    public void hash_size(){
        assertEquals(0.0,hash.size());
        try {
            hash.put(10,10);
            hash.put(11,11);
        }catch (YaExiste e){}
        assertEquals(2.0,hash.size());
        try {
            hash.remove(10);
        }catch (NoEsta e){}
        assertEquals(1.0,hash.size());
        try {
            hash.remove(11);
        }catch (NoEsta e){}
        assertEquals(.0,hash.size());
    }
    @Test
    public void hash_put(){
        try {
            hash.put(10,10);
            hash.put(26,26);
            hash.put(42,42);
            hash.put(10,10);
        }catch (YaExiste e){
            System.out.println("Ya existe");
        }
        assertEquals(true,hash.contains(10));
        try {
            assertEquals(10,hash.get(10));
        }catch (NoEsta e){}
        assertEquals(3.0,hash.size());
    }

    @Test
    public void hash_indice(){
        try {
            hash.put(10,10);
            hash.put(26,26);
            hash.put(42,42);
        }catch (YaExiste e){System.out.println("Ya existe");}
        try {
            assertEquals(10,hash.indice(10));
            assertEquals(11,hash.indice(26));
            assertEquals(12,hash.indice(42));
        }catch (NoEsta e){}

    }

    @Test
    public void hash_contain(){
        try {
            hash.put(10,100);
            hash.put(26,26);
        }catch (YaExiste e){}
        assertEquals(true,hash.contains(10));
        assertEquals(true,hash.contains(26));
        assertEquals(false,hash.contains(200));
        try {
            hash.remove(10);
        }catch (NoEsta e){}
        assertEquals(false,hash.contains(10));
        assertEquals(true,hash.contains(26));
    }
    @Test
    public void hash_remove_rehash(){
        try {
            hash.put(10,10);
            hash.put(26,26);
            hash.put(27,27);
            hash.put(42,42);
        }catch (YaExiste e){}
        assertEquals(true,hash.contains(10));
        assertEquals(4.0,hash.size());
        try {
            assertEquals(10,hash.indice(10));
            assertEquals(11,hash.indice(26));
            assertEquals(12,hash.indice(27));
            assertEquals(13,hash.indice(42));
        }catch (NoEsta e){}
        try {
            hash.remove(10);
        }catch (NoEsta e){}
        assertEquals(false,hash.contains(10));
        assertEquals(3.0,hash.size());
        try {
            assertEquals(10,hash.indice(26));
            assertEquals(11,hash.indice(27));
            assertEquals(12,hash.indice(42));
        }catch (NoEsta e){}
    }

    @Test
    public void hash_get(){
        try {
            hash.put(10,100);
            hash.put(20,200);
        }catch (YaExiste e){}
        try {
            assertEquals(100,hash.get(10));
            hash.remove(10);
            assertEquals(200,hash.get(20));
            assertEquals(false,hash.contains(10));
            assertEquals(10,hash.get(10));
            assertEquals(1.0,hash.size());
            assertNull(hash.get(10));
        }catch (NoEsta e){}
    }

    @Test
    public void hash_Linkedlistkeys(){
        try {
            hash.put(10,100);
            hash.put(20,200);
            hash.put(15,15);
        }catch (YaExiste e){}
        MyLinkedListImpl<Integer> Kl = hash.Keys();
        assertTrue(Kl.contains(10));
        assertTrue(Kl.contains(20));
        assertTrue(Kl.contains(15));
    }
     @Test
    public void hash_Linkedlistvalue(){
         try {
             hash.put(10,100);
             hash.put(20,200);
             hash.put(15,15);
         }catch (YaExiste e){}
        MyLinkedListImpl<Integer> Kl = hash.Values();
         assertTrue(Kl.contains(100));
         assertTrue(Kl.contains(200));
         assertTrue(Kl.contains(15));
    }

    @Test
    public void hash_resize(){
        try {
            hash.put(0,0);
            hash.put(1,1);
            hash.put(2,2);
            hash.put(3,3);
            hash.put(4,4);
            hash.put(10,10);
            hash.put(6,6);
            hash.put(7,7);
            hash.put(8,8);
            hash.put(5,5);
            hash.put(11,11);
            hash.put(9,9);
            hash.put(27,27);
        }catch (YaExiste e){}
        try {
            hash.put(29,29);
            hash.put(17,17);
            hash.put(32,51);
        }catch (YaExiste e){System.out.println("ya esxiste");}
        assertEquals(true,hash.contains(0));
        assertEquals(true,hash.contains(1));
        assertEquals(true,hash.contains(2));
        assertEquals(true,hash.contains(3));
        assertEquals(true,hash.contains(4));
        assertEquals(true,hash.contains(6));
        assertEquals(true,hash.contains(7));
        assertEquals(true,hash.contains(8));
        assertEquals(true,hash.contains(5));
        assertEquals(true,hash.contains(9));
        assertEquals(true,hash.contains(27));
        assertEquals(true,hash.contains(17));
        assertEquals(true,hash.contains(32));
        assertEquals(true,hash.contains(29));

        assertEquals(16.0,hash.size());
        assertEquals(32,hash.capacity());
        try {
           assertEquals(10,hash.indice(10));
            assertEquals(27,hash.indice(27));
            assertEquals(17,hash.indice(17));
            assertEquals(9,hash.indice(9));
        }catch (NoEsta e){System.out.println("NOESTA");}
    }

    @Test
    public void hash_resize2(){
        try {
            hash.put(0,0);
            hash.put(1,1);
            hash.put(2,2);
            hash.put(3,3);
            hash.put(4,4);
            hash.put(10,10);
            hash.put(6,6);
            hash.put(7,7);
            hash.put(8,8);
            hash.put(5,5);
            hash.put(11,11);
            hash.put(9,9);
            hash.put(27,27);
        }catch (YaExiste e){}
        try {
            hash.put(29,29);
            hash.put(17,17);
            hash.put(32,51);
        }catch (YaExiste e){System.out.println("ya esxiste");}
        assertEquals(true,hash.contains(0));
        assertEquals(true,hash.contains(1));
        assertEquals(true,hash.contains(2));
        assertEquals(true,hash.contains(3));
        assertEquals(true,hash.contains(4));
        assertEquals(true,hash.contains(6));
        assertEquals(true,hash.contains(7));
        assertEquals(true,hash.contains(8));
        assertEquals(true,hash.contains(5));
        assertEquals(true,hash.contains(9));
        assertEquals(true,hash.contains(27));
        assertEquals(true,hash.contains(17));
        assertEquals(true,hash.contains(32));
        assertEquals(true,hash.contains(29));

        assertEquals(16.0,hash.size());
        assertEquals(32,hash.capacity());
        try {
            assertEquals(10,hash.indice(10));
            assertEquals(27,hash.indice(27));
            assertEquals(17,hash.indice(17));
            assertEquals(9,hash.indice(9));
        }catch (NoEsta e){System.out.println("NOESTA");}
    }

}

