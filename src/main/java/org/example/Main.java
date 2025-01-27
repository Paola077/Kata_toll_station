package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstacionPeaje peaje = new EstacionPeaje("Peaje Central", "Ciudad X");

        System.out.println("Sistema de Peaje");
        while (true) {
            System.out.println("\n1. Registrar Coche");
            System.out.println("2. Registrar Moto");
            System.out.println("3. Registrar Camión");
            System.out.println("4. Imprimir Reporte y Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                break;
            }

            System.out.print("Ingrese la placa del vehículo: ");
            String placa = scanner.next();

            switch (opcion) {
                case 1:
                    peaje.registrarVehiculo(new Coche(placa));
                    break;
                case 2:
                    peaje.registrarVehiculo(new Moto(placa));
                    break;
                case 3:
                    System.out.print("Ingrese el número de ejes: ");
                    int ejes = scanner.nextInt();
                    peaje.registrarVehiculo(new Camion(placa, ejes));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        peaje.imprimirReporte();
        scanner.close();
    }
}