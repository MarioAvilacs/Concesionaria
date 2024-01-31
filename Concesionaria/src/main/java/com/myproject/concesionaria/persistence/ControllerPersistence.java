package com.myproject.concesionaria.persistence;

import com.myproject.concesionaria.logica.Automovil;
import com.myproject.concesionaria.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControllerPersistence {
    
    AutomovilJpaController automovilJpa = new AutomovilJpaController();

    public void guardarAuto(Automovil auto) {
        automovilJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return automovilJpa.findAutomovilEntities();
    }

    public void eliminarCarro(int numId) {
        try {
            automovilJpa.destroy(numId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int numId) {
        return automovilJpa.findAutomovil(numId);
    }

    public void modificarAuto(Automovil auto) {
        try {
            automovilJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
