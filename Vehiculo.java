package Poo.CocheCRUD;

public class Vehiculo{

    String marca;
    String modelo;
    String color;
    int year;

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, String color, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void add(Vehiculo vehiculo) {
    }
}
