package com.mycompany.mavenproject12;
public class Perfiles {
    String Nombre;
    int Edad;
    String Piel;
    public Perfiles(String Nombre,int Edad, String Piel ){
        this.Nombre= Nombre;
        this.Edad= Edad;     //emmm averiguando la funcion de eso en mi progam
        this.Piel= Piel; 
    }
    public Perfiles(String Nombre, int Edad){
        this.Nombre= Nombre;// bueno esto hace que se reciban datos de variables
                                //almenos eso creo
        this.Edad= Edad;
    }
    
    public String getNombre(){
        return Nombre;  
    }
    public int getEdad(){
        return Edad;
    }
    public String getPiel(){
        return Piel;
    }
    public void setNombre(String Nombre){
        this.Nombre= Nombre;
       
    }
    public void setEdad(int Edad){
        this.Edad= Edad;
    }
    public void setPiel(String Piel){
        this.Piel= Piel;
    }
    public void getPerfil(){
    System.out.println("*********************");
    System.out.println("*******"+Nombre+"********");
    System.out.println("Este animal es un "+Nombre);    
    System.out.println("con una edad de "+ Edad);
    System.out.println("su color de piel es: "+ Piel);
    System.out.println("*********************");
}  
}
    
    
    

