import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        //Caso d5
        //d es 100 en codigo ascii ,si quiero la cuarta posicion en el tablero tengo que restar 96 y 5 en codigo ascii es 53 para que de 5 tengo que restar 48
        Scanner sc=new Scanner(System.in);
        System.out.print("\nIntroduzca la posición:  ");
        String posicion =sc.nextLine();
        int columnaAlfil = (int)(posicion.charAt(0)) - 96;//4
        int filaAlfil = (int)(posicion.charAt(1)) - 48;//-5

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))//Si la resta entre la fila y la fila por la que va fila es igual a la resta de la columna y la columna en la que va
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {//La fila no deben coincidir y las columnas deben ser iguales.
                    //convierto la columna en letra
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}


