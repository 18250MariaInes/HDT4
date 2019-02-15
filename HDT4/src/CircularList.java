/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class CircularList<E> extends abstractList<E> {
    protected Nodo<E> tail; 
protected int count;

public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Nodo<E> temp = new Nodo<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Nodo<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Nodo<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
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
