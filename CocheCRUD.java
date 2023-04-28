package Poo.CocheCRUD;

import java.util.List;
import java.util.ArrayList;

public class CocheCRUD{

        List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();

        public void save (Vehiculo vehiculo){

            vehiculo.add(vehiculo);
        }

            public List<Vehiculo> findAll(){
            return vehiculo;
            }

    }