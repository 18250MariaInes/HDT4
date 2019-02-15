/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase interfaz cuenta con los metodos basicos para un pila generica
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

public interface Stack<E> 
{

    /**
     * Permite agregar un elemento a la pila
     * @param item
     */
    public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
    /**
     * Metodo que elimina al ultimo elemento de la lista
     * @return elemento borrado
     */
    public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
    /**
     * Metodo que toma al siguiente elemento a eliminar
     * @return el ultimo elemento del stack
     */
    public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
    /**
     * Determina si el elemento contiene data o no
     * @return true o false segun el estado de la lista
     */
    public boolean empty();
   // post: returns true if and only if the stack is empty
   
    /**
     * Determina el tamanio de objeto
     * @return
     */
    public int size();
   // post: returns the number of elements in the stack

}
