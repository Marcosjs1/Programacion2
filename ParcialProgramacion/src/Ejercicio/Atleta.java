package Ejercicio;
import java.lang.Math;
import java.util.Random;

public class Atleta extends Persona implements Contrato {
    private double altura;
    private int edad;
    private double peso;

    public Atleta() {
    }

    public Atleta(int DNI, String nombre, double altura, int edad, double peso) {
        super(DNI, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaIMC() {
        return (this.peso/Math.pow(this.altura,2));
    }

    @Override
    public boolean hayPesoExtra() {
        if (calculaIMC() < 18.5){
            return true;
        } else if (calculaIMC()>= 18.5 && calculaIMC() <= 24.9) {
            return false;
        } else if (calculaIMC() >= 25 && calculaIMC() <= 29.9){
            return true;
        } else {
            return true;
        }
    }

    @Override
    public double tomarPulsaciones() {
        Random rand = new Random();
        double pulsacionesAleatorias = 50 + (rand.nextDouble()*(120-50));

        return pulsacionesAleatorias;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+"//DNI: "+getDNI()+"//Edad: "+getEdad()+"//Peso: "+getPeso()+"//Altura: "+getAltura() ;
    }
}


