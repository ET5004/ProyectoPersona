/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Homero");
        Domicilio domicilio = new Domicilio();
        domicilio.setPais("Argentina");
        domicilio.setCiudad("Tandil");
        domicilio.setCalle("Av. Siempreviva");
        domicilio.setAltura(751);
        persona.setDomicilio(domicilio);
        LocalDate fechaNac = LocalDate.of(1972, Month.FEBRUARY, 28);
        persona.setFechaNacimiento(fechaNac);
        
        System.out.println(persona);
        
        
    }   
    
    
    
}
