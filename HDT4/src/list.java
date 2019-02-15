/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase interfaz proporciona metodos basicos para una cualquier Pila
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

public interface list<E>{

    /**
     * 
     * @return
     */
    public int size();
   // post: returns number of elements in list

    /**
     *
     * @return
     */
    public boolean isEmpty();
   // post: returns true iff list has no elements

    /**
     *
     */
    public void clear();
   // post: empties list

    /**
     *
     * @param value
     */
    public void addFirst(E value);
   // post: value is added to beginning of list

    /**
     *
     * @param value
     */
    public void addLast(E value);
   // post: value is added to end of list

    /**
     *
     * @return
     */
    public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

    /**
     *
     * @return
     */
    public E getLast();
   // pre: list is not empty
   // post: returns last value in list

    /**
     *
     * @return
     */
    public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

    /**
     *
     * @return
     */
    public E removeLast();
   // pre: list is not empty
   // post: removes last value from list

    /**
     *
     * @param value
     * @return
     */
    public E remove(E value);
   // post: removes and returns element equal to value
   // otherwise returns null

    /**
     *
     * @param value
     */
    public void add(E value);
   // post: value is added to tail of list

    /**
     *
     * @return
     */
    public E remove();
   // pre: list has at least one element
   // post: removes last value found in list

    /**
     *
     * @return
     */
    public E get();
   // pre: list has at least one element
   // post: returns last value found in list

    /**
     *
     * @param value
     * @return
     */
    public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

    /**
     *
     * @param value
     * @return
     */
    public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

    /**
     *
     * @param value
     * @return
     */
    public int lastIndexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

    /**
     *
     * @param i
     * @return
     */
    public E get(int i);
   // pre: 0 <= i < size()
   // post: returns object found at that location

    /**
     *
     * @param i
     * @param o
     * @return
     */
    public E set(int i, E o);
   // pre: 0 <= i < size()
   // post: sets ith entry of list to value o;
   // returns old value

    /**
     *
     * @param i
     * @param o
     */
    public void add(int i, E o);
   // pre: 0 <= i <= size()
   // post: adds ith entry of list to value o

    /**
     *
     * @param i
     * @return
     */
    public E remove(int i);
   // pre: 0 <= i < size()
   // post: removes and returns object found at that location

   //public Iterator<E> iterator();
   // post: returns an iterator allowing
   // ordered traversal of elements in list
    
}
