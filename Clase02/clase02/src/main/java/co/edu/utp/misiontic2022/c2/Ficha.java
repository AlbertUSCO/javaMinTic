package co.edu.utp.misiontic2022.c2;

public class Ficha
{   //Atributos de la clase
    public String nombre;
    public String color;
    public int posicion; 
    
    // Constructor o metodo constructor 
    public Ficha(String nombre, String color, int posicion){

        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }
    
    //Metodos de la clase 
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve del punto inicial " + pInicial + " al punto final " + pFinal;
    }
    public String desplazamiento(){
        return "La ficha se esta moviendo";
    }
    public String toString(){
        return "Nombre: " + nombre + " Color: " + color + " Posicion: " + posicion;
    }
}
