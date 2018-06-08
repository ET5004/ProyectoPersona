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
        Scanner scan = new Scanner(System.in);
        
        Persona [] personas = new Persona[10];
        for(int i = 0; i < personas.length; i++){
            personas[i] = personaDesdeTeclado(scan);
            System.out.println(personas[i]);
        }
    }
    
    public static float promedioEdades(Persona [] personas){
        float suma = 0;
        for(int i = 0; i < personas.length; i++){
            suma+=personas[i].getEdad();
        }
        return suma / personas.length;
    }
    
    public static Persona obtenerMayor(Persona [] personas){
        Persona mayor = personas[0];
        for(int i = 1; i < personas.length; i++){
            if(mayor.getEdad()>personas[i].getEdad()){
                mayor = personas[i];
            }
        }
        return mayor;
    }
      
    public static LocalDate fechaDesdeTeclado(Scanner scan){
        return LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }
        
    public static Persona personaDesdeTeclado(Scanner scan){
        Persona persona = new Persona();
        System.out.print("Nombre: ");
        persona.setNombre(scan.next());
        Domicilio domicilio = new Domicilio();
        domicilio.setPais("Argentina");
        domicilio.setCiudad("Tandil");
        
        System.out.print("Domicilio (Calle altura): ");
        domicilio.setCalle(scan.next());
        domicilio.setAltura(scan.nextInt());
        persona.setDomicilio(domicilio);
        System.out.print("Nacimiento (Año mes dia): ");
        persona.setFechaNacimiento(fechaDesdeTeclado(scan));
        
        return persona;
    }
    
    
    
}
