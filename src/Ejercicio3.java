import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y  nos diga cuántos números se han introducido, la media de los impares y el mayor de los pares.

El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/   int numero=0;
        int contador=0;
        int contadorImpares=0;
        int sumaImpares=0;
        double mediaImpares=0;
        int mayorpar=0;
        do{
            System.out.println("Media de Impares= "+mediaImpares);
            System.out.println("Mayor par= "+mayorpar);
            System.out.println("Introduzca un numero");
            System.out.println("Si quiere salir ponga un numero negativo");
            numero=sc.nextInt();

            contador++;
            if(contador%2!=0){
                contadorImpares++;
                sumaImpares+=numero;
                mediaImpares=sumaImpares/contadorImpares;
            }
            if(contador%2==0){
                if(mayorpar<numero){
                    mayorpar=numero;
                }
            }
        }
        while(numero>=0);
        System.out.println("Has salido");

    }
}

