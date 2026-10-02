import vista.Consola;

import java.util.Scanner;

import static control.Accion.realizarAccion;
import static vista.Consola.leerOpcion;
import static vista.Consola.mostrarMenu;

public class Main {
    static void main() {
        int opcion = 0;
        mostrarMenu();
        while ((opcion=leerOpcion())!=0) {
            realizarAccion(opcion);
            System.out.println(opcion);
            mostrarMenu();
        }
    }
}
