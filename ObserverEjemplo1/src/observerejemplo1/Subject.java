/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerejemplo1;

import java.util.List;

/**
 *
 * @author Sofía
 */
public abstract class Subject {
    private List<Observer> listaObservers;
    
    public void AgregarObserver(Observer observer){
        listaObservers.add(observer);
    }
    
    
}
