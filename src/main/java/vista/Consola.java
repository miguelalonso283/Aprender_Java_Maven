package vista;

import java.util.Scanner;

public class Consola {

    static Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------MI APLICACIÓN DE FORMULA 1-------------------\n");
        sb.append("1.-  Insertar escuderia\n");
        sb.append("2.-  Borrar escuderia\n");
        sb.append("3.-  Seleccionar escuderias\n");
        sb.append("0.-  Salir\n");
        sb.append("----------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    public static int leerOpcion() {
        return  sc.nextInt();
    }
}
