package com.mycompany.mavenproject12;
import java.lang.Math;
import java.util.Scanner;
public class Calculadora {
    /*cambie el tipo de datos de la variable de todo el codigo a double
    por que emplee la clase Math.sqrt para hacer la funcion de Raiz
*/
   //utilizare el Scanner luego para ingresar datos desde la consola
   Scanner pedir= new Scanner(System.in);
    /*todas las variable tuve que cambiarla a tipo double por la funcion Raiz
   y potenciacion*/
    private double var1;      //NOTA: puse las variables private 
    private double var2;
    private double var3;
    private double resultado;
    //este metodo lo uso para operaciones con dos variables
    public Calculadora (double var1, double var2){
        this.var1= var1;
        this.var2= var2; 
    }
    //esta la uso para potencia y raiz
    public Calculadora (double var1){
        this.var1=var1;
    }
    //estoy implementando una que use tres variables
    public Calculadora (double var1, double var2, double var3){
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
    }
    /*el metodo para dar valor lo cambie de int a double, hubiese afectado el 
    funcionamiento del programa
    */
    public void setVar1(double var1){
        this.var1= var1;
    }
    public void setVar2(double var2){
        this.var2= var2;  
    }
    public void setVar3 (double var3){
        this.var3= var3;
    }
    public double getSuma(){
        resultado= var1+var2; 
        /*la prueba usando dos diferentes tipos de variables resultado segun
        el metodo que se vaya a ejecutar salio bien
        */
        resultado= var1+var2+var3;
        return resultado;
        
    }
    public double getResta(){
        resultado=var1-var2;
        resultado= var1-var2-var3;
        return resultado;
        
    }
    public double getRaiz(){
        resultado= Math.sqrt(var1);
        return resultado;
    }
    public double getPotencia(){
        resultado= Math.pow(var1,var2);
        return resultado;
    }
    
    
    //PROBANDO CODIGO**** CODIGO PROBADO Y SIMPLIFICADO :(
    public void suma(){
        System.out.println("****Se esta sumando****");
        System.out.println("Ingrese primer numero a Sumar: ");
        var1=pedir.nextDouble();
        System.out.println("Ingrese segundo numero a Sumar: ");
        var2=pedir.nextDouble();
        resultado= var1+var2;
        resultado= var1+var2+var3+var3;
        System.out.println("La suma de: "+ var1+(" + "+var2 +(" es igual a: " + resultado) ) );
    }
    //calculadora con interacion externa desde consola
    public void resta(){
        System.out.println("****Se esta Restando****");
        System.out.println("Ingresa primer numero a Restar: ");
        var1= pedir.nextDouble();
        System.out.println("Ingresa Segundo numero a Restar: ");
        var2= pedir.nextDouble();
        resultado= var1-var2;
        resultado= var1-var2-var3;
        System.out.println("La resta es: "+ resultado);
    }
    public void Raiz(){
        System.out.println("****Se esta sacando Raiz****");
        System.out.println("Ingrese el numero: ");
        var1=pedir.nextDouble();
        resultado= Math.sqrt(var1);
        System.out.println("La raiz de "+var1+(" es ")+resultado);
    }
    public void Potencia(){
        System.out.println("Se esta sacando potencia");
        System.out.println("Ingrese el numero a potenciar: ");
        var1=pedir.nextDouble();
        System.out.println("ingrese el exponente");
        var2=pedir.nextDouble();
        resultado=Math.pow(var1, var2);
        System.out.println("La potencia de "+var1+(" elevado a: ")+var2 +(" es igual a: ")+resultado);
    }
    public void Imprimir(double valor){
        System.out.println(valor);
        
    }
    }
    
  
