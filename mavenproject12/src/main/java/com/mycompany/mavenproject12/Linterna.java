
package com.mycompany.mavenproject12;

public class Linterna {
    String Marca= "Duracell"; 
    String Color= "Negro";   
    boolean Estado= false;  //este se supone que es el boton encedido y apagado
    int intensidad= 0;    // aqui me refiero a la intensidad luminosa
    
    public void On(){
        Estado= true;
        System.out.println("Encendida");  //agregar el void y el condicional de intensidad var
        if (intensidad<1)Estado=false ; 
      
    }
    public void off(){
        Estado= false;
        if (intensidad>0)intensidad=0;
        System.out.println("apagada");
    }
    public void Aumentarluz(){
        intensidad ++;
        System.out.println("luz aumentada en 1");
    }
    public void Disminuirluz(){
        intensidad --;
        System.out.println("luz disminuida en 1");
    }
    public void setColor(String Color){
        this.Color= Color;
    }
    public void setMarca(String Marca){
        this.Marca= Marca;
    }
    public void EstadoActual(){
        System.out.println("La linterna es marca: "+ Marca);
        System.out.println("Su color es: "+ Color);
        System.out.println("Esta encendidad la Linterna: "+ Estado);
        System.out.println("Su intensidad luminosa es de: "+ intensidad);
    }  
}