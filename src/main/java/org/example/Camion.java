package org.example;

public class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int calcularPeaje() {
        return 50 * numeroEjes;
    }
}
