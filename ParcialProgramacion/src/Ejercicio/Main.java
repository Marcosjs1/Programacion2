package Ejercicio;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(43151394,"Juan Marquez",1.81,25,85.5);
        Atleta a2 = new Atleta(48557566,"Pepe Romero",1.51,20,102.9);
        Atleta a3 = new Atleta(41222554,"Esteban Quito",1.99,29,90.5);
        Atleta a4 = new Atleta(78554455,"Pipo Gorocito",1.70,25,74.5);
        Atleta a5 = new Atleta(47555294,"Gaston Marquez",2.05,58,99.8);
        Atleta a6 = new Atleta(35888488,"Brian Juarez",1.98,18,82.9);
        Atleta a7 = new Atleta(12455555,"Marlon Brandon",1.68,22,200.8);
        Atleta a8 = new Atleta(55856965,"Lucas Perez",1.77,25,80.5);
        EquipoNacional e = new EquipoNacional("Azul","Argentina");
        e.agregarAtleta(a1);
        e.agregarAtleta(a2);
        e.agregarAtleta(a3);
        e.agregarAtleta(a4);
        e.agregarAtleta(a5);
        e.agregarAtleta(a6);
        e.agregarAtleta(a7);
        e.agregarAtleta(a8);
        Prueba p1 = new Prueba(1,"Prueba Aerobica");
        Prueba p2 = new Prueba(2,"Prueba Anaerobica");
        Prueba p3 = new Prueba(3,"Prueba de coordinacion");
        Instalacion i1 = new Instalacion("Aerobica","Tunuyan","J","X");
        Sede s = new Sede(2,"25-10-2024","14:45");
        s.agregarPruebas(p1);
        s.agregarPruebas(p2);
        s.agregarPruebas(p3);
        s.agregarInstalaciones(i1);
        for (Atleta atleta : e.getAtletas()) {
            System.out.println(atleta);
            System.out.println("IMC: "+atleta.calculaIMC());
            System.out.println("Pulsaciones: "+atleta.tomarPulsaciones()+'\n');
        }
        for (Atleta atleta: e.getAtletas()){
            if(atleta.hayPesoExtra()){
                System.out.println("El atleta "+ atleta.getNombre()+" no esta en forma");
            }else {
                System.out.println("El atleta "+atleta.getNombre()+ " esta en forma");
            }
        }
        
        System.out.println();

    }
}
