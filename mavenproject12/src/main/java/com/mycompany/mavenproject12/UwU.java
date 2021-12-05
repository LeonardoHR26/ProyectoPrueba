
package com.mycompany.mavenproject12;
import java.util.Scanner;
public class UwU {
    /*aun estoy aprendiendo a profundidad de los constructores, me confunde
    un poco la parte de que se pueden usar y no usar... (referencia video de 
    youtube: Curso java intermedio#26)
    
    */
    public UwU(){
        /*
        el scaner es una funcion que estoy aprendiendo, no se nada mas aparte
        de que recolecta datos que podemos ingresar desde la consola
        */
        Scanner pedir = new Scanner(System.in);
        /*
        aun no se como agregar en esta parte otro tipo de variables que no sean 
        del tipo String, cada vez que agrego de otro tipo me sale un error
        que no se identificar
        */
        /*
        en unos ejemplo vi que ponian los String de esta forma
         String Id= "";
        no se por que lo ponian asi...
        */
        String Id;
        String Elo;
        String Pl;
        String Servidor;
        String Continue;
        String Division;
       
        
        System.out.println("Cual es tu ID");
        Id= pedir.nextLine();
        
        System.out.println("En que Elo estas?");
        Elo= pedir.nextLine();
        
        System.out.println("En que Division estas?");
        Division= pedir.nextLine();
        
        System.out.println("Cuanto Pl tienes?");
        Pl= pedir.nextLine();
        
        System.out.println("En que servidor juegas 'manco'");
        Servidor=pedir.nextLine();
        
        System.out.println("************Creando Perfil*************");
        
        System.out.println("Presione cualquier tecla para continuar");
        Continue= pedir.nextLine();
        
        System.out.println("Creando perfil... (cargando)");
        /*
        esta parte tengo que aprender a concatenar los String entre ellos, 
        ahi me abria ahorrado vairos System.out.println
       
        */
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("Hola "+Id );
        System.out.print("Eres un "+Elo);
        System.out.println(" division #"+Division);
        System.out.println("con un numero de pl de "+Pl);
        System.out.println("del servidor "+Servidor);
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("deja este juego de mierda, si?");
        
                
        
        
        
        
  
    
}
    
}
