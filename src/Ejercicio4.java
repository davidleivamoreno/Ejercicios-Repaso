import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero=sc.nextInt();
        String numeroS=numero+"";
        System.out.println("Introduzca un dígito: ");
        String digito=sc.nextInt()+"";
        char [] fromString = numeroS.toCharArray();

        int posicion=numeroS.indexOf(digito)+1;
        System.out.println("Esta en la posicion : "+posicion);

    }
}
