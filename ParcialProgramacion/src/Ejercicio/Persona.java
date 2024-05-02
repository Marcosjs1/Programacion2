package Ejercicio;

public class Persona {
    private int DNI;
    private String nombre;

    public Persona() {
    }

    public Persona(int DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
