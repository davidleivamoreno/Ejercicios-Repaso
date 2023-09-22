import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        /*Escribe un programa que calcule el precio final de un producto según su  base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general,  reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,    se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

     Ejemplo:
     Introduzca la base imponible: 25
     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
     Base imponible        25.00
     IVA (10%)              2.50
     Precio con IVA        27.50
     Cód. promo. (mitad): -13.75
     TOTAL                 13.75

*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la base imponible:");
        double baseImponible=sc.nextDouble();
        sc.nextLine();
        double baseImponibleInicial=baseImponible;
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
        enum IVA{general,reducido,superreducido};

        String tipoIVA=sc.nextLine();
        double IVA=0;
        double IVAnumero=0;
        double PrecioIva=0;
        switch (tipoIVA.toLowerCase()){
            case "general":
                baseImponible=baseImponible+baseImponible*0.25;
                PrecioIva=baseImponible;
                IVA= baseImponible*0.25;
                IVAnumero=25;
                break;
            case "reducido":
                baseImponible=baseImponible+baseImponible*0.10;
                PrecioIva=baseImponible;
                IVA= baseImponible*0.10;
                IVAnumero=10;
                break;
            case "superreducido":
                baseImponible=baseImponible+baseImponible*0.04;
                PrecioIva=baseImponible;
                IVA= baseImponible*0.04;
                IVAnumero=4;
                break;
            default:
                System.out.println("No existe ese tipo");


        }
        System.out.println("Elige el codigo promocional");
        System.out.println("[nopro, mitad, meno5 o 5porc]");
        String promocion=sc.nextLine();
        double PrecioPromocion=0;
        switch (promocion.toLowerCase()){
            case "nopro":
                System.out.println("La base imponible es "+baseImponible);
                break;
            case "mitad":
                baseImponible=baseImponible-baseImponible/2;
                PrecioPromocion=-baseImponible/2;
                break;
            case "meno5":
                baseImponible=baseImponible-5;
                PrecioPromocion=baseImponible-5;
                break;
            case "5porc":
                baseImponible=baseImponible-baseImponible*0.05;
                PrecioPromocion=baseImponible*0.05;
                break;
            default:
                System.out.println("No existe ese tipo");
        }
        System.out.println("Base Imponible: "+baseImponibleInicial);
        System.out.println("IVA ( "+ IVAnumero+" % ) \t -"+PrecioIva);
        System.out.println("Precio con IVA: "+PrecioIva);
        System.out.println("TOTAL \t "+baseImponible);
    }
}