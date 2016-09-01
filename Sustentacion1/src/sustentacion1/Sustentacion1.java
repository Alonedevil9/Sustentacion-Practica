/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificacion;

import java.util.Scanner;

public class Sustentacion1 {

    public static void main(String[] args) {

        int opcion, cantu = 0;
        String buscar="";

        String producto[][] = new String[20][4];
        Scanner lector = new Scanner(System.in);
        producto prod = new producto();
        

        System.out.println("Bienvenidos a TiendaSoft 1.0");
        System.out.println("\n");
        System.out.println("<<Opciones>>");
        System.out.println("\n");
        System.out.println("1. Agregar Producto :");
        System.out.println("2. Buscar Producto:");
        System.out.println("3. Eliminar Producto:");
        System.out.println("4. Mostrar Inventario:");
        System.out.println("5. Realizar Ventas:");
        System.out.println("6. Mostrar Ganancias Totales:");
        System.out.println("7. Salir:");
        System.out.println("\n");
        System.out.println("Ingresar cantidad de usuarios: ");
        cantu = lector.nextInt();

        do {
            System.out.println("\n");
            System.out.println("Ingresar opcion:");
            opcion = lector.nextInt();

            switch (opcion) {
                
                case 1: 
                    prod.case1(cantu, producto, lector);
                    break;

                case 2:
                    prod.case2(buscar, lector, cantu, producto);
                    break;

                case 3:
                    prod.case3(buscar, lector, cantu, producto);
                    break;

                case 4:
                    prod.case4(cantu, producto);
                    
                    break;

                case 5:
                    prod.case5(buscar, producto, lector, cantu);
                    break;

                case 6:
                    prod.case6(cantu, producto);

                    break;

                case 7:
                    System.out.println("<<Salir>>");
                    System.out.print("Saliendo....");
                    break;

                default:
                    System.out.println("Esta Opcion no existe");
                    break;
            }
        } while (opcion != 7);
    }

}
