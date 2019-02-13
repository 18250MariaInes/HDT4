

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class StackLista<E> extends AbstractStack<E>{
    private list list;
    
    
    public StackLista (int n){
        FactoryList f = new FactoryList();
        list=f.creadorList(n);
    }
    public void push(E item){
        this.list.add(item);
   }

    /**
     *metodo que saca el ultimo elemento agregado del vector
     * @return el numero de la pila que se elimino
     */
    @Override
   public E pop(){
       // pre: stack is not empty
        // post: most recently pushed item is removed and returned
       int size=list.size();
       int ultimo=size-1;
       E element=(E) list.get(ultimo);
       list.remove(ultimo);
       return element;
   }
   
    /**
     *metodo que muestra el ultimo o siguiente a ser popped de la lista
     * @return el numero pronto a ser popped
     */
    @Override
   public E peek(){
       int size=list.size();
       int ultimo=size-1;
       E element = (E) list.getLast();
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
