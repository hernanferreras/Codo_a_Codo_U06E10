
package u06e10;

import java.util.Scanner;

public class U06E10 {
    public static void main(String args[]) {
        String[] paises = {"Argentina", "Chile", "Uruguay", "Paraguay", "Bolivia", "Peru", "Colombia", "Honduras", "Guatemala", "Panama", "Costa Rica"};
        int posicion; 
        posicion=ingresaPosicion(paises);
        muestraPosicion(paises, posicion);
    }
    static int ingresaPosicion(String[] a){
        int j;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Ingrese un numero mayor a 0 y menor a "+(a.length+1)+": ");
            j=entrada.nextInt();
        }while(j<0||j>(a.length));
        return(j);
    }
    static void muestraPosicion(String[] a, int b){
        System.out.print("La posicion "+(b)+" del array es: "+a[b-1]);
    }
}