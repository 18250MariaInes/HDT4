/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class DoublyLinkedList<E> extends abstractList<E> {
    protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
        
    }

    @Override
    public E getFirst() {
        E value = null;
        return value;
    }

    @Override
    public E getLast() {
        E value = null;
        return value;
    }

    @Override
    public E removeFirst() {
        E value = null;
        return value;
    }

    @Override
    public E remove(E value) {
        value = null;
        return value;
    }

    @Override
    public void add(E value) {
        
    }

    @Override
    public E remove() {
        E value = null;
        return value;
    }

    @Override
    public E get() {
        E value = null;
        return value;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        E value = null;
        return value;
    }

    @Override
    public E set(int i, E o) {
        E value = null;
        return value;
    }

    @Override
    public void add(int i, E o) {
        
    }

    @Override
    public E remove(int i) {
        E value = null;
        return value;
    }
    
    public E pop(){
        E value=removeLast();
        return value;
    }
    
    public void push(E item){
        addLast(item);
    }
    
    
}
