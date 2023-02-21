package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    public static int cantidadCreados;

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int cantidadAsientos = 0;
        for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                cantidadAsientos++;
            }
        }
        return cantidadAsientos;
    }

    public String verificarIntegridad() {
        boolean registroCorrecto = true;
        if (motor.getRegistro() != registro) {
            registroCorrecto = false;
        }
        for (Asiento asiento : asientos) {
            if (asiento.getRegistro() != registro) {
                registroCorrecto = false;
                break;
            }
        }
        if (registroCorrecto) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}