/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase extiende la clase abstracta de list generica, utiliza un Nodo generico
 * y un contador para poder crear un objeto tipo Lista circular
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */
public class CircularList<E> extends abstractList<E> {

    /**
     * Nodo que funciona como la cola
     */
    protected Nodo<E> tail; 

    /**
     * Contador de elementos
     */
    protected int count;

    /**
     *
     */
    public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

    /**
     * Agrega un elemento al incio de la lista
     * @param value
     */
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

    /**
     * Se establece en nuevo elemento al final de la lista
     * @param value
     */
    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

    /**
     * Se elimina el ultimo elemento de la lista
     * @return
     */

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
    @Override
    public E getFirst() {
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
    
}
