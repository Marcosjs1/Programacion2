package Ejercicio;

import java.util.ArrayList;
import java.util.Collection;

public class EquipoNacional {
    private String color;
    private String pais;
    private Collection<Atleta> atletas;

    public EquipoNacional() {
    }

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.atletas = new ArrayList<Atleta>();
    }
    public void agregarAtleta(Atleta atleta){
        this.atletas.add(atleta);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public Collection<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(Collection<Atleta> atletas) {
        this.atletas = atletas;
    }

}
