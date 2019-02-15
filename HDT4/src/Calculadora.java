/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 15 de Febrero de 2019  -  Algoritmos y Estructuras UVG
 * Esta clase implementa la interfaz calculator y permite hacer
 * operaciones logicas entre dos distintos numero enteros
 */

/**
 *
 * @author maria y camila
 */
public class Calculadora implements Calculator{
    //Atributo que permite Singleton
    private static Calculadora miCalcu;
    
    /**
     *
     * @return
     */
    public static Calculadora getCalcu(){
        if (miCalcu==null){
            miCalcu=new Calculadora();
        }
        return miCalcu;
    }
    
    /**
     * Metodo que determina que operacion ejecutar segun el operando recibido y hace los calculos necesarios
     * @param num1
     * @param num2
     * @param op
     * @return el resultado de la operacion
     */
    @Override
    public int calculate (int num1, int num2, String op){
        int dato1 = num1;
        int dato2 = num2;
        int resul;
        String signo = op;
        if (signo.equals("+")){
            resul=dato1+dato2;
        }else if (signo.equals("-")){
            resul=dato1-dato2;
        }else if (signo.equals("/")){
            resul=dato1/dato2;
        }else{
            resul=dato1*dato2;
        } 
        return resul;
    }
}
