package org.example;

import java.util.ArrayList;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private int totalRecaudado;
    private ArrayList<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        int peaje = vehiculo.calcularPeaje();
        totalRecaudado += peaje;
        vehiculos.add(vehiculo);
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " registrado. Peaje: $" + peaje);
    }

    public void imprimirReporte() {
        System.out.println("\n--- Reporte de la Estación de Peaje ---");
        System.out.println("Estación: " + nombre + " | Ciudad: " + ciudad);
        System.out.println("Vehículos registrados:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("- Placa: " + vehiculo.getPlaca() + " | Peaje: $" + vehiculo.calcularPeaje());
        }
        System.out.println("Total Recaudado: $" + totalRecaudado);
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
