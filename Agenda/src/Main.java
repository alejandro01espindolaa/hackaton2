import java.util.Scanner;
import com.alejandro.Agenda.funciones.swichf;

public class Main {
    public static void main(String[] args) {
        String opc;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa una opcion\n" +
                    "1./ Leer\n" +
                    "2./ Agregar \n" +
                    "3./ Eliminar \n" +
                    "4./ Salir" +
                    "5./ Limpiar lista");

            opc = sc.next();

            if (!opc.matches("[1-5]")) {
                System.out.println("Opcion invalida. Por favor, ingresa un numero entre 1 y 4.");
                continue;
            }

            swichf sw = new swichf();
            sw.elegiropcion(opc);

            if (opc.equals("4")) {
                System.out.println("Saliendo del programa...");
                break;
            }
        }

        sc.close();
    }
}