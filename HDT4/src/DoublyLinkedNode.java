/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 * @param <E>
 */
public class DoublyLinkedNode<E> {

    /**
     *
     */
    protected E data;

    /**
     *
     */
    protected DoublyLinkedNode<E> nextElement;

    /**
     *
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
     *
     * @param o
     */
    public void setNext(DoublyLinkedNode o){
    this.nextElement = o;
    o.previous();
}

    /**
     *
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
