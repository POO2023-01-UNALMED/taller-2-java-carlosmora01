package test;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }
    
    public int getRegistro() {
        return registro;
    }
}
