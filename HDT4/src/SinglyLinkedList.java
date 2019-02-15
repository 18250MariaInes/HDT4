/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class SinglyLinkedList<E> extends abstractList<E> {
     protected int count; // list size
   protected Nodo<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Nodo<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Nodo<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Nodo<E> temp = new Nodo<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Nodo<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Nodo<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }

    @Override
    public void clear() {
        
    }

    @Override
    public E getLast() {
        E value = null;
        return value;
    }

    @Override
    public E removeLast() {
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
