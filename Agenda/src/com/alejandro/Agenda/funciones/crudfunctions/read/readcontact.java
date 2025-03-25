package com.alejandro.Agenda.funciones.crudfunctions.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class readcontact {

    public void readcontactag(String nombre1, String apellidop1, String apellidom1, String telefono1, String userID1){
        String rarchive = "C:\\Users\\Re\\Desktop\\Generation\\Practices\\java\\java tasks\\Hack3\\Agenda\\src\\com\\alejandro\\Agenda\\lista\\agenda.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rarchive))) {
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    // Verificar si todos los parámetros coinciden
                    if (datos[0].equals(nombre1) && datos[1].equals(apellidop1) && datos[2].equals(apellidom1) &&
                            datos[3].equals(telefono1) && datos[4].equals(userID1)) {
                        // Imprimir el contacto si coincide
                        System.out.println("Nombre: " + datos[0]);
                        System.out.println("Apellido Paterno: " + datos[1]);
                        System.out.println("Apellido Materno: " + datos[2]);
                        System.out.println("Telefono: " + datos[3]);
                        System.out.println("Id de usuario: " + datos[4]);
                        System.out.println("-------------------------");
                        encontrado = true;
                        break; // Salir del bucle si se encuentra el contacto
                    }
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró un contacto que coincida con los parámetros proporcionados.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }


}
}
