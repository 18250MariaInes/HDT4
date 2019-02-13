/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class FactoryStack {
    
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
