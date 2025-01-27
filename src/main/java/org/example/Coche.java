package org.example;

public class Coche extends Vehiculo {
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public int calcularPeaje() {
        return 100;
    }
}
