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
    //Getter y Setter "Metodos"

    public String getNombre(){
        return nombre;
    }
    public String getColor(){
        return color;
    }

    public int getPosicion(){
        return posicion;
    }

    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public void  setColor(String color){
        this.color = color;
    }

    public void  setPosicion(int posicion){
        this.posicion = posicion;
    }

    //Metodos de la clase 
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve del punto inicial " + pInicial + " al punto final " + pFinal;
    }
    public String desplazamiento(String nombre){
        return "La ficha "+ nombre +" se esta moviendo";
    }
    public String toString(){
        return "Nombre: " + nombre + " Color: " + color + " Posicion: " + posicion;
    }
}
