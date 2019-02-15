/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear una ArrayList que extiende de la clase Abstracta Stack
 * y cuenta con un ArrayList generico como parametro
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

import java.util.ArrayList;

/**
 *
 * @author Camila
 * @param <E>
 */
public class StackArraylist<E> extends  AbstractStack<E> {

    /**
     * Atributo que contiene todos los datos almacenados
     */
    protected ArrayList<E> data;

    /**
     * Constructor
     */
    public StackArraylist()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

   
    public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    
    public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    
    public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    
    public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    
    public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}   
}
