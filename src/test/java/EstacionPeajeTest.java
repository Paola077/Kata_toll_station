import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstacionPeajeTest {

    @Test
    void testCocheCalculaPeaje() {
        Coche coche = new Coche("ABC123");
        assertEquals(100, coche.calcularPeaje(), "El peaje para un coche debe ser $100");
    }

    @Test
    void testMotoCalculaPeaje() {
        Moto moto = new Moto("XYZ987");
        assertEquals(50, moto.calcularPeaje(), "El peaje para una moto debe ser $50");
    }

    @Test
    void testCamionCalculaPeaje() {
        Camion camion = new Camion("CAM456", 3);
        assertEquals(150, camion.calcularPeaje(), "El peaje para un camión con 3 ejes debe ser $150");
    }

    @Test
    void testRegistrarVehiculoEnEstacion() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad X");
        Coche coche = new Coche("ABC123");
        estacion.registrarVehiculo(coche);

        assertEquals(100, estacion.getTotalRecaudado(), "El total recaudado debe ser $100 después de registrar un coche");
    }

    @Test
    void testRegistrarVariosVehiculosEnEstacion() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad X");
        estacion.registrarVehiculo(new Coche("ABC123"));
        estacion.registrarVehiculo(new Moto("XYZ987"));
        estacion.registrarVehiculo(new Camion("CAM456", 2));

        assertEquals(250, estacion.getTotalRecaudado(), "El total recaudado debe ser $250 después de registrar varios vehículos");
    }

    @Test
    void testListaVehiculosRegistrados() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad X");
        estacion.registrarVehiculo(new Coche("ABC123"));
        estacion.registrarVehiculo(new Moto("XYZ987"));

        ArrayList<Vehiculo> vehiculos = estacion.getVehiculos();
        assertEquals(2, vehiculos.size(), "La estación debe tener 2 vehículos registrados");
        assertEquals("ABC123", vehiculos.get(0).getPlaca(), "El primer vehículo debe tener la placa ABC123");
        assertEquals("XYZ987", vehiculos.get(1).getPlaca(), "El segundo vehículo debe tener la placa XYZ987");
    }
}
