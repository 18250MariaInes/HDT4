

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria y camila
 */
public class MainClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        //Se instancia el arreglo en el cual se guardaran los datos del txt
        ArrayList<String> lect = new ArrayList<String>();
        //Se instancia un objeto de clase pila y otro de tipo calculadora
        Stack<Integer> pila;
        Calculadora calculadora = new Calculadora();
        //Variables necesarias para recibir eleccion de usuario
        Scanner scan = new Scanner(System.in);
        int eleccion;
        
        //Se instancia un objeto tipo FactoryStack para crear la opcion elegida por el usuario
        FactoryStack myfactory=new FactoryStack();
        FactoryList factory = new FactoryList();
        
        System.out.println("Introduzca con que opcion desea calcular la expresión postfix");
        System.out.println("1. Lista simplemente encadenada");
        System.out.println("2. Lista Doblemente encadenada");
        System.out.println("3. Lista Circular");
        System.out.println("4. Stack de Arraylist");
        System.out.println("5. Stack de vector");
        try{
             eleccion=scan.nextInt();
        } catch(InputMismatchException e){
            System.out.println("No haz ingresado un numero. El programa se ejecutara con una Lista Simple Encadenada\n");
            eleccion = 1;
        }
        
        //Se lee el documento txt
        try{
            Stream<String> lines = Files.lines(
                    Paths.get("datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> lect.add(a));
        } catch (IOException e){
            System.out.println("Error!");
        }
        
        //switch para leer el el .txt, guardarlo y operarlo segun la opcion seleccionada
        
                //si elige Stack de ArrayList
                                pila= myfactory.creadorStack(eleccion);
                             
                                for (int i=0; i<=(lect.size()-1); i++){
                    //Se obtiene el string del txt y se transforma a un array
                    String s = lect.get(i);
                    String[] arr = s.split(" ");
                    //Se crea una lista
                    List<String> one = Arrays.asList(s.split(" "));
                    //Se transforma en un arraylist y se guarda
                    List<String> two = new ArrayList<>(Arrays.asList(s.split(" ")));

                    //Se evalua cada objeto de array y si es int se agrega a la pila
                    for (int m = 0; m <=((two.size())-1); m++){
                        //System.out.println("estoy en el for");
                        String item = two.get(m);
                        int a;
                        try {
                            a=Integer.parseInt(item); //el item se intenta transformar en int
                            pila.push(a);  //Se agrega a la pila
                             
                             

                        }
                           catch (NumberFormatException e){
                               //Si el item es de tipo String se sacan dos elementos de la pila
                               
                               int dato1 = pila.pop();
                               //System.out.println("Este es el numero 1"+dato1);
                               int dato2 = pila.pop();

                               //Se operan los elementos con el signos usando la calculadora
                               int nuevo = calculadora.calculate(dato1, dato2, item);
                               //Se agrega el resultado a la pila
                               pila.push(nuevo);
                               //System.out.println("Este es el numero pushed al final"+nuevo);
                        }
                    }
                    //Se imprime el resultado finalCalcu
                    System.out.println("Esta es el resultado: "+ pila.peek());
                                }
    
    }
}
