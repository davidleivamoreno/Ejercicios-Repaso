import java.util.NoSuchElementException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Escriba su segunda nota");
        double nota2 = sc.nextDouble();

        double notamedia = (nota1 + nota2 ) / 2;
        if(notamedia<5){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? ");
            System.out.println("[Apto ; noApto]");
            String esApto=" ";
            try{
                esApto=sc.nextLine();
            }catch (NoSuchElementException e1){
                System.out.println("Elemento no deseado no hay nada");
            }
            if(esApto.equalsIgnoreCase("Apto")){
                notamedia=5;
                System.out.println("Tu nota es un "+notamedia);
            }else{
                System.out.println("Tu nota es un "+notamedia);
            }
        }else{
            System.out.println("Tu nota media es un "+ notamedia);
            System.out.println("Enhorabuena has aprobado");
        }
        }
    }
