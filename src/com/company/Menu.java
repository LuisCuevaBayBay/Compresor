package com.company;


public class Menu {

    public int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------MENU PRINCIPAL----------------------");
        System.out.println("1. COMPRIMIR ARCHIVOS");
        System.out.println("2. COMPRIMIR TEXTO");
        System.out.println("3. DESCOMPRIMIR ARCHIVOS");
        System.out.println("4. VER LOS ARCHIVOS DISPONIBLES");
        System.out.println("5. SALIR");

        int opcion = 0;

        while((opcion <1)|| (opcion>6)){
            LectorTeclado lt = new LectorTeclado();
            opcion = lt.leerEntero("Favor Ingrese una opcion","Intente de nuevo");

            if ((opcion<1)||(opcion>6)){
                System.out.println("OPCION NO VALIDA");
            }
        }
        return opcion;
    }
}
