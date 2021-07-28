package main.java.co.edu.utp.miciontic2022.c2.reto2;


public class PrecioTotal {
     //Atributos
     private double totalPrecios;
     private double totalVolqueta;
     private double totalCarroNascar;
     private Carro[] carro;
     
     //Constructor
     public PrecioTotal(Carro[] carro){
        
         this.carro = carro;
         
     }
     //Metodos
     public void calcularTotales(){
        for (int i = 0; i <= carro.length - 1; i++) {
            
            totalPrecios += carro[i].calcularPrecio();

            if (carro[i].getClass() == Volqueta.class) {
                totalVolqueta += carro[i].calcularPrecio();
            } else {
                totalCarroNascar += carro[i].calcularPrecio();
            }
        }
     }
     public void mostrarTotales(){
         //Calculo  de totales
         calcularTotales();
         System.out.println("Total Carro " + totalPrecios);
         System.out.println("Total Volqueta " + totalVolqueta);
         System.out.println("Total Carro Nascar " + totalCarroNascar);
 
     }
    
}
