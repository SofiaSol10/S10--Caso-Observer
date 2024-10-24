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
public class Duende implements Observer{
    private String nombreDuende;
    private String poder;
    private String personalidad;

    public Duende(String nombreDuende) {
        this.nombreDuende = nombreDuende;
        this.poder = "Dinero";
        this.personalidad = "Bueno";
    }
    
    

    @Override
    public void update(String clima) {
        if(clima.equalsIgnoreCase("primavera")){
            System.out.println("DUENDE HACE MAGIA");
        }
        if(clima.equalsIgnoreCase("verano")){
            System.out.println("MOMENTO DE SALIR A DISFRUTRAR DEL PAISAJE");
        }
        if(clima.equalsIgnoreCase("otoño")){
            System.out.println("DEBO TRABAJAR");
        }
        if(clima.equalsIgnoreCase("invierno")){
            System.out.println("HORA DE DORMIR");
        }
    }

    
    
}
