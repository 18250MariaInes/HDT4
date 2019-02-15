/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear una pila de tipo lista generica que extiende de la clase AbstractaStack
 * y cuenta con una lista como unico atributo
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

public class StackLista<E> extends AbstractStack<E>{
    private list list;
    
    /**
     *
     * @param n
     */
    public StackLista (int n){
        FactoryList f = new FactoryList();
        list=f.creadorList(n);
    }
    @Override
    public void push(E item){
        this.list.addLast(item);
   }

    /**
     *metodo que saca el ultimo elemento agregado del vector
     * @return el numero de la pila que se elimino
     */
    @Override
   public E pop(){
       // pre: stack is not empty
        // post: most recently pushed item is removed and returned
       E borrado = (E)list.removeLast();
       return borrado;
   }
   
    /**
     *metodo que muestra el ultimo o siguiente a ser popped de la lista
     * @return el numero pronto a ser popped
     */
    @Override
   public E peek(){
       int size=list.size();
       int ultimo=size-1;
       E element = (E) list.removeLast();
       return element;
   }
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
    /**
     *metodo que chequea si el vector está vacio
     * @return retorna true or false dependiendo del estado
     */
    @Override
   public boolean empty(){
    if (list.size()==0){
        return true;
    }else{
        return false;
    }
}
   // post: returns true if and only if the stack is empty
   
    /**
     *metodo que muestra el tamano de nuesto vector
     * @return su tamaño
     */
    @Override
   public int size(){
       return list.size();
   }
   // post: returns the number of elements in the stack
}
