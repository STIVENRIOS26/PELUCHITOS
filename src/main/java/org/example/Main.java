package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);

        System.out.println("🧸🧸🧸🧸🧸🧸🧸🧸🧸🧸");
        System.out.println("🧸TIENDA PELUCHITOS🧸");
        System.out.println("🧸🧸🧸🧸🧸🧸🧸🧸🧸🧸");

        //se declaran las variables
        String nombreNuevoPeluche="";
        Double precioUnitario=0.0;
        Double precioventa=0.0;

        Integer opcion;
        //Menú

        System.out.println("1. Para agregar nombre y precio unitario de un nuevo peluche.");
        System.out.println("2. Para calcular el precio de venta + IVA.");
        System.out.println("3. Para mostrar la información del nuevo peluche.");
        System.out.println("4. Editar precio unitario de un nuevo peluche.");
        System.out.println("5. Para salir");

        do{
            System.out.println("Elige una opcion del menú: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.print("Digita el nombre del nuevo peluche: ");
                    nombreNuevoPeluche=teclado.nextLine();
                    System.out.print("Digite el precio unitario del nuevo peluche: ");
                    precioUnitario=teclado.nextDouble();
                    System.out.println("El peluche "+ nombreNuevoPeluche +"fue agregado con exito✅");
                    break;

                case 2:
                 if(precioUnitario==0){
                     System.out.println("No se puede calcular sin preio unitario.");

                 }else{
                     precioventa=precioUnitario*1.19;
                     System.out.println("El precio ha sido calculado.✅");
                 }
                 break;

                case 3:
                    System.out.println("El peluche nuevo es: "+ nombreNuevoPeluche);
                    System.out.println("El precio del peluche:" + precioUnitario);
                    System.out.println("El precio de venta del peluche es: "+ precioventa);
                    break;
                case 4:
                    System.out.println("Digite el nuevo precio unitario: $");
                    precioUnitario= teclado.nextDouble();
                    precioventa=precioUnitario*1.19;
                    break;
                case 5:
                    System.out.println("Hasta luego🖐🖐");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while(opcion!=5);
        System.out.println("Hasta luego🖐🖐");











    }
}