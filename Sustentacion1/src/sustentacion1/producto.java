/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificacion;

import java.util.Scanner;

public class producto {

    public void case1(int cantu, String producto[][], Scanner lector) {
        System.out.println("<<Agregar Producto>>");
        for (int f = 0; f < cantu; f++) {
            System.out.print("\n");
            System.out.print(f + 1);
            System.out.print("\n");
            System.out.print("Nombre: ");
            producto[f][0] = lector.next();
            System.out.print("Cantidad: ");
            producto[f][1] = lector.next();
            System.out.print("Valor por unidad:");
            producto[f][2] = lector.next();
            producto[f][3] = "0";
            System.out.print("\n");
        }
    }

    public void case2(String buscar, Scanner lector, int cantu, String producto[][]) {
        System.out.println("<<Buscar Producto>>");
        System.out.print("\n");
        buscar = lector.next();
        for (int f = 0; f < cantu; f++) {
            if (producto[f][0].equals(buscar)) {
                System.out.print("cantidad= " + producto[f][1] + " " + "valor unidad= " + producto[f][2]);
            }
        }

    }

    public void case3(String buscar, Scanner lector, int cantu, String producto[][]) {
        System.out.println("<<Eliminar Producto>>");

        System.out.print("\n");
        System.out.print("Que producto desea eliminar: ");
        buscar = lector.next();
        for (int f = 0; f < cantu; f++) {
            if (producto[f][0].equals(buscar)) {
                producto[f][0] = "0";
                producto[f][1] = "0";
                producto[f][2] = "0";
            }
        }
        System.out.println("valores borrados");

    }

    public void case4(int cantu, String producto[][]) {
        System.out.println("<<Mostrar Inventario>>");
        for (int f = 0; f < cantu; f++) {
            System.out.print("\n");
            System.out.print(f + 1);
            System.out.print("\n");

            System.out.print("Nombre: " + producto[f][0]);
            System.out.print("\n");
            System.out.print("Cantidad: " + producto[f][1]);
            System.out.print("\n");
            System.out.print("Valor por unidad:" + producto[f][2]);
            System.out.print("\n");
            System.out.print("vendidos:" + producto[f][3]);
            System.out.print("\n");
        }

    }

    public void case5(String buscar, String producto[][], Scanner lector, int cantu) {

        System.out.println("<<Realizar Ventas>>");
        int vender;
        int nprod,
                xprod;

        System.out.print("\n");
        System.out.println("Buscar producto que deseas vender: ");
        buscar = lector.next();

        for (int f = 0; f < cantu; f++) {
            if (producto[f][0].equals(buscar)) {
                System.out.print("cuanto deseas vender de este producto: ");

                vender = lector.nextInt();
                nprod = Integer.parseInt(producto[f][1]);

                if (vender < nprod) {

                    xprod = nprod - vender;
                    System.out.print("te quedaron: " + xprod);

                    producto[f][1] = String.valueOf(xprod);
                    producto[f][1] = Integer.toString(xprod);

                    producto[f][3] = String.valueOf(vender);
                    producto[f][3] = Integer.toString(vender);
                } else {
                    System.out.print("No existe tanta cantidad");
                }
            }
        }

    }

    public void case6(int cantu,String producto[][]) {
        System.out.println("<<Mostrar Ganancias Totales>>");

        double vendi,
                valor,
                valorp,
                valort = 0;

        for (int f = 0; f < cantu; f++) {
            System.out.print("\n");
            System.out.print(f + 1);
            System.out.print("\n");

            System.out.print("Nombre: " + producto[f][0]);
            System.out.print("\n");
            System.out.print("Cantidad: " + producto[f][1]);
            System.out.print("\n");
            System.out.print("Valor por unidad:" + producto[f][2]);
            System.out.print("\n");
            System.out.print("vendidos:" + producto[f][3]);
            System.out.print("\n");
            vendi = Integer.parseInt(producto[f][3]);
            valor = Integer.parseInt(producto[f][2]);
            valorp = vendi * valor;

            valort += valorp;
            System.out.print("venta por este producto :" + valorp);

            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("venta total :" + valort);

    }

}
