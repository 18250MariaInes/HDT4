/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear un Nodo que sera utilizado en la clase DoublyLinkedNode
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */
public class DoublyLinkedNode<E> {

    /**
     *
     */
    protected E data;

    /**
     * Objeto que apunta al siguiente
     */
    protected DoublyLinkedNode<E> nextElement;

    /**
     * Objeto que apunta al anterior
     */
    protected DoublyLinkedNode<E> previousElement;

    /**
     *
     * @param v
     * @param next
     * @param previous
     */
    public DoublyLinkedNode(E v,
                        DoublyLinkedNode<E> next,
                        DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

    /**
     *
     * @param v
     */
    public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     * Se establece en nuevo siguiente elemento
     * @param o
     */
    public void setNext(DoublyLinkedNode o){
    this.nextElement = o;
}

    /**
     * Se establece en nuevo anterior elemento
     * @return
     */
    public DoublyLinkedNode previous (){
    return previousElement;
}

    /**
     * 
     * @return
     */
    public E value(){
    return data;
}
}
