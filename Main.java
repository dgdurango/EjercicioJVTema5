package Poo.CocheCRUD;

import java.util.List;

public class Main{


    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUD();

        Vehiculo renault = new Vehiculo("Renault", "Duster", "Blanco", 2016);
        Vehiculo ford = new Vehiculo("Ford", "Fiesta", "Negro", 2019);
        Vehiculo honda = new Vehiculo("Honda", "Civic", "Rojo", 2021);

        //System.out.println(ford);

        cocheCRUD.save(renault);
        cocheCRUD.save(ford);
        cocheCRUD.save(honda);

        List<Vehiculo> vehiculo = cocheCRUD.findAll();
        System.out.println(vehiculo);


    }

}