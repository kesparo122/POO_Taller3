package com.mycompany.proyecto1;
import MisClases.Bicicleta;
import MisClases.TodoTerreno;
public class Proyecto1 {

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta();
        TodoTerreno bicicleta2 = new TodoTerreno();
        bicicleta1.velocidades = 5;
        bicicleta1.frenar();
        
        bicicleta2.velocidades = 7;
        bicicleta2.suspension = true;
        bicicleta2.saltar();
    }
}
