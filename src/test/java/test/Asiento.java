package test;

class Asiento {
	String color;
    int precio;
    int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String colorPermitido : coloresPermitidos) {
            if (nuevoColor.equalsIgnoreCase(colorPermitido)) {
                this.color = nuevoColor;
                break;
            }
        }
    }
    
    public int getRegistro() {
        return registro;
    }

}
