package com.alejandro.Agenda.funciones;
import  com.alejandro.Agenda.funciones.crudfunctions.read.readAgenda;
import  com.alejandro.Agenda.funciones.crudfunctions.read.readcontact;


import java.util.Scanner;


public class swichf {

   public void elegiropcion(String opc){
    String a;

        readAgenda read = new readAgenda();
        readcontact readc = new readcontact();



       switch (opc){
           case "1":
               Scanner sc = new Scanner(System.in);
               String opc2;

               String nombre1;
               String apellidop1;
               String apellidop2;
               String telefono1;
               String userID1;

               System.out.println("deseas:" +
                       "1. buscar usuario en agenda?" +
                       "2. ver agenda completa");
               opc2 = sc.next();

               readc.readcontactag(nombre1,apellidop1,apellidop2,telefono1,userID1);

               switch (opc2){
                   case "1":
                       System.out.println("Ingrea nombre que deseas buscar");
                       nombre1 = sc.next();
                       System.out.println("Ingrea apellido Paterno que deseas buscar que deseas buscar");
                       apellidop1= sc.next();
                       System.out.println("Ingrea apellido Materno que deseas buscar que deseas buscar");
                       apellidop2 = sc.next();
                       System.out.println("Ingrea Telefono que deseas buscar que deseas buscar");
                       telefono1 = sc.next();
                       System.out.println("Ingrea User ID que deseas buscar que deseas buscar");
                       userID1 = sc.next();
                       readc.readcontactag(nombre1,apellidop1,apellidop2,telefono1,userID1);
                       break;


                   case "2":
                       read.readlist();
                        break;

                   default:
                       System.out.printf("opcion incorrecta, vuelve a intentar");
                       break;


               }

               break;

           case "2":

               break;

           case "3":
               break;

           case "4":
               System.out.println("Saliendo del programa...");
               break;


           default:
               System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
               break;
       }
   }

}
