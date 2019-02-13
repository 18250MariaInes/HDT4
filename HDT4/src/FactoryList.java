/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class FactoryList {
    
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
