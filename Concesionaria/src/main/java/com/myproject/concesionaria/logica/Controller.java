package com.myproject.concesionaria.logica;

import com.myproject.concesionaria.persistence.ControllerPersistence;
import java.util.List;

public class Controller {

    ControllerPersistence persistence = new ControllerPersistence();

    public void guardarAuto(String modelo, String marca, String motor,
            String color, String placa, int cantPuertas) {

        //Asignando los valores obtenidos de la gui.
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);

        //Guardando los valores en la BD.
        persistence.guardarAuto(auto);
    }

    public List<Automovil> traerAutos() {
        return persistence.traerAutos();
    }

    public void eliminarCarro(int numId) {
        persistence.eliminarCarro(numId);
    }

    public Automovil traerAuto(int numId) {
        return persistence.traerAuto(numId);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String placa, int cantPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
        
        persistence.modificarAuto(auto);
    }

}
