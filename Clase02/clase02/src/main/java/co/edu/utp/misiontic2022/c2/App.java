package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {   Scanner sc = new Scanner(System.in);
        Ficha objFicha1 = new Ficha("Caballo", "Blanco", 4);
        Ficha objFicha2 = new Ficha("Torre", "Blanco", 8);
        
        System.out.println(objFicha1.toString());
        System.out.println(objFicha2.toString());

        System.out.println(objFicha1.desplazamiento(objFicha1.getNombre()));
        
        objFicha1.setNombre("Reina");

        System.out.println(objFicha1.toString());
    }
}
