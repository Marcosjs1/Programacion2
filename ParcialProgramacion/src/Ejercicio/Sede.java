package Ejercicio;

import java.util.ArrayList;

public class Sede {
    private int fase;
    private String fecha;
    private String hora;
    private ArrayList<Prueba>pruebas;
    private ArrayList<Instalacion>instalaciones;

    public Sede() {
    }

    public Sede(int fase, String fecha, String hora) {
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
        this.pruebas = new ArrayList<Prueba>();
        this.instalaciones = new ArrayList<Instalacion>();
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public ArrayList<Instalacion> getInstalaciones() {
        return instalaciones;
    }

    public void agregarPruebas(Prueba prueba){
        this.pruebas.add(prueba);
    }
    public void agregarInstalaciones(Instalacion instalacion){
        this.instalaciones.add(instalacion);
    }


    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
