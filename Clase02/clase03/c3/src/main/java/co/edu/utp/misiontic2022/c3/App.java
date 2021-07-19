package co.edu.utp.misiontic2022.c3;

//Diapositiva 17 clase 3 unidad 1
public class App
{
    public static void main( String[] args )
    {
       Persona objPersona1=new Empleado("Byron", 35, 2345.25);
       Persona objPersona2=new Cliente("Harvin",34,"3214567890");

       objPersona1.mostrar();
       objPersona2.mostrar();
       //Compocicion
       Empresa objEmpresa=new Empresa("MisionTic2022", (Empleado) objPersona1);
       System.out.println(objEmpresa.toString());


       System.out.println(objEmpresa.contactoCliente((Cliente)objPersona2));
       
    }

}     
