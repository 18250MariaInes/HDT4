/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear clases de tipo lista de forma eficiente
 */

/**
 *
 * @author maria y camila
 */
public class FactoryList {
    
    /**
     * Se agrega crea un tipo de lista segun el tipo seleccionado determinado por n
     * @param n
     * @return
     */
    public list creadorList(int n){
        if (n==1){
            return new SinglyLinkedList();
        }else if (n==2){
            return new DoublyLinkedList();
        }else{
            return new CircularList();
        }
    }
}
