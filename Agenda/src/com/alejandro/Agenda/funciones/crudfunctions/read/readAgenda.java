package com.alejandro.Agenda.funciones.crudfunctions.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readAgenda {
    public void readlist(){

        String rarchive =  "C:\\Users\\Re\\Desktop\\Generation\\Practices\\java\\java tasks\\Hack3\\Agenda\\src\\com\\alejandro\\Agenda\\lista\\agenda.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(rarchive))){
            String linea;
            while((linea= br.readLine())!= null){
                String [] datos = linea.split(",");
                if (datos.length == 5){
                    System.out.println("Nombre: " + datos[0]);
                    System.out.println("Apellido Paterno: " + datos[1]);
                    System.out.println("Apellido Materno: " + datos[2]);
                    System.out.println("Telefono: " + datos[3]);
                    System.out.println("Id de ususario: " + datos[4]);
                    System.out.println("-------------------------");
                } else {
                    System.out.println("Linea ignorada formato incorrecto");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
