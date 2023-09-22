package Ejercicio5;
import java.util.Scanner;
public class Triangulo  {
    // Variables
    protected double lado1, lado2;
    protected String color;
    // Constructor
    public Triangulo(double lado1, double lado2, String color) {
        this.color=color;
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    public double lado3() {
        double lado3 = 0;
        lado3 = Math.pow(lado2, 2) - lado1;
        lado3 = Math.sqrt(lado3);
        return lado3;
    }

    public double perimetro() {
        double perimetro = this.lado1 + this.lado2 + lado3();
        return perimetro;
    }

    public double area() {
        double area = 0;
        area = (lado3() * lado2) / 2;
        return area;
    }


    public void pintar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Altura del Triangulo");
        int alturaIntroducida=sc.nextInt();
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;

        while (planta <= alturaIntroducida) {


            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print("*");

            }

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }

}



