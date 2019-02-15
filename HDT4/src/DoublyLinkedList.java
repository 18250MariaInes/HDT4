/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase extiende la clase abstracta de list generica, utiliza dos Nodos generico
 * y un contador para poder crear un objeto tipo Lista doblemente encadenada
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */
public class DoublyLinkedList<E> extends abstractList<E> {

    /**
     * Contador de elementos 
     */
    protected int count;

    /**
     * Nodo que funciona como cabeza
     */
    protected DoublyLinkedNode<E> head;

    /**
     * Nodo que funciona como cola
     */
    protected DoublyLinkedNode<E> tail;

    /**
     *
     */
    public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

    /**
     * Se agrega un elemento al inicio de la lista
     * @param value
     */
    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

    /**
     * Se agrega un elemento al final de la lista
     * @param value
     */
    public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

    /**
     * Se elimina el elemento al final de la lista
     * @return
     */
    public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}

    /**
     * 
     * @return
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     *
     */
    @Override
    public void clear() {
        
    }

    /**
     *
     * @return
     */
    public E addFirst() {
        E value = null;
        return value;
    }

    /**
     *
     * @return
     */
    @Override
    public E getLast() {
        E value = null;
        return value;
    }

    /**
     *
     * @return
     */
    @Override
    public E removeFirst() {
        E value = null;
        return value;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public E remove(E value) {
        value = null;
        return value;
    }

    /**
     *
     * @param value
     */
    @Override
    public void add(E value) {
        
        
    }

    /**
     *
     * @return
     */
    @Override
    public E remove() {
        E value = null;
        return value;
    }

    /**
     *
     * @return
     */
    @Override
    public E get() {
        E value = null;
        return value;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public int indexOf(E value) {
        return 0;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public E get(int i) {
        E value = null;
        return value;
    }

    /**
     *
     * @param i
     * @param o
     * @return
     */
    @Override
    public E set(int i, E o) {
        E value = null;
        return value;
    }

    /**
     *
     * @param i
     * @param o
     */
    @Override
    public void add(int i, E o) {
        
    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public E remove(int i) {
        E value = null;
        return value;
    }
    
    /**
     *
     * @return
     */
    public E pop(){
        E value=removeLast();
        return value;
    }
    
    /**
     *
     * @param item
     */
    public void push(E item){
        addLast(item);
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
