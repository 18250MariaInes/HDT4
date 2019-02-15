/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase permite crear clases de tipo Stack de forma eficiente
 */

/**
 *
 * @author maria y camila
 */
public class FactoryStack {
    
    /**
     * Se crea un elemento de tipo Stack dependiendo del seleccionado segun n
     * @param n
     * @return
     */
    public Stack creadorStack(int n){
        if (n==1){
            return new StackLista(n);
        }else if (n==2){
            return new StackLista(n);
        }else if (n==3){
            return new StackLista(n);
        }else if (n==4){
            return new StackArraylist();
        }else if (n==5){
            return new PilaVector();
        }else{
            return null;
        }
    }
}
