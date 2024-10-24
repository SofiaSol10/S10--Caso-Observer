/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerejemplo1;

/**
 *
 * @author Sofía
 */
public class Ogro implements Observer {
    private String nombreOgro;
    private String poder;
    private String personalidad;

    public Ogro(String nombreOgro) {
        this.nombreOgro = nombreOgro;
        this.poder = "Inmortalidad";
        this.personalidad = "ser maligno";
    }
    
    

    @Override
    public void update(String clima) {
        
    }

   
}
