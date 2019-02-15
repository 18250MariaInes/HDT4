/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear una Pila simplemente encadenada generica que extiende de la clase AbstractaList
 * y cuenta con un nodo generico y un contador como atributos
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

public class SinglyLinkedList<E> extends abstractList<E> {

    /**
     *
     */
    protected int count; // list size

    /**
     *
     */
    protected Nodo<E> head; // ref. to first element

    /**
     *
     */
    public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
    /**
     *
     * @return
     */
    public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
    /**
     *  Se agrega un elemento en el principio de la lista
     * @param value
     */
    public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Nodo<E>(value, head);
     count++;
  }
  
    /**
     * Se elimina al elemento en el principio de la lista
     * @return
     */
    public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Nodo<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
    /**
     * Se se devuelve al elemento en el principio de la lista
     * @return
     */
    public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
    /**
     * Se agrega un elemento al final de la lista
     * @param value
     */
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
   
    /**
     * Comprueba que un elemento determinado este dentro de la lista
     * @param value
     * @return
     */
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
    public E removeLast() {
        Nodo<E> finger = head;
        Nodo <E> previous=null;
        
      while (finger.next()!=null){
          previous=finger;
          finger=finger.next();
      }
      if (previous == null){
          head=null;
      }else{
          previous.setNext(null);
       }
      count--;
      return finger.value();
	  
   
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
       addLast(value);
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
        E value=removeFirst();
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
        E value=removeFirst();
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
    
}
