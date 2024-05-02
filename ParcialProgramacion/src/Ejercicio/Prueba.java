package Ejercicio;

import java.util.ArrayList;

public class Prueba {
    private int codigo;
    private String titulo;
    private ArrayList<Atleta>atletas1;

    public Prueba() {
    }

    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.atletas1 = new ArrayList<Atleta>();
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
