import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc=new Scanner (System.in);

        System.out.println("Digite un numero");
        int num = sc.nextInt();
        System.out.println(dtNumero(num));
        
        System.out.println("Digite los grados centigrados");
        int c = sc.nextInt();
        System.out.println("Los grados fahrenheit = "+grados(c));

        System.out.println("Digite un numero");
        int n = sc.nextInt();
        System.out.println(operadorCondicional(n));

    }

    public static String dtNumero(int n) {
    //firma del metodo   nombre del metodo
        return "doble= " + (n*2) + " triple= " + (n*3);
    }

    public static double grados (double c){
        return 32+(9*(c/5));
    } 

    public static String operadorCondicional(int n){
        return n%2 == 0 ? n+" es par":n+" es impar";
    }
}


