/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase abstracta implementa a la interfaz Lista y
 * agrega metodos necesarios para un elemento tipo Lista
 */

/**
 *
 * @author maria y camila
 * @param <E>
 */

public abstract class abstractList<E> implements list<E>{

    /**
     *
     */
    public void AbstractList()
   // post: does nothing
   {
   }

    /**
     * Metodo que comparte el estado (lleno o vacio) del arreglo
     * @return
     */
    public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
    /**
     * Compara cada elemento de la lista con un elemento especifico
     * @param value
     * @return
     */
    public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
    
}
