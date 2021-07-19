public class Franquicia {
    

    public Franquicia  (){
        
    }
    public String compararFranquicia (int pTiempo, double pCapital, double pInteres){

        String resultado="";
        if (pTiempo==0 || pCapital==0 || pInteres==0) {
            resultado="Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
    }  else {
        double interesSimple = pCapital*pInteres*pTiempo;
        double interesCompuesto= pCapital*(Math.pow((1+pInteres),pTiempo) -1);
        resultado="La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" +String.valueOf(interesCompuesto-interesSimple);

    }
    return resultado; 

}     
    
    
}
