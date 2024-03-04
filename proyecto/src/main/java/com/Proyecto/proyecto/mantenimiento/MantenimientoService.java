package com.Proyecto.proyecto.mantenimiento;

import com.Proyecto.proyecto.bicicleta.Bicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // SI no hay un @Service, no se crea un Bean.
public class MantenimientoService {

    private final MantenimientoRepository mantenimientoRepository;


    @Autowired  // Inyeccion automatica cuando se realiza una instancia de este objeto.
    public MantenimientoService(MantenimientoRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    public void saveMantenimiento(Mantenimiento mantenimiento){
        mantenimientoRepository.save(mantenimiento);
    }


    public void updateMantenimiento(Long id, Mantenimiento nuevoMantenimiento){
        Mantenimiento mantenimientoInsertar = mantenimientoRepository.findById(id).orElse(null);

        mantenimientoInsertar.setTipoMantenimiento(nuevoMantenimiento.getTipoMantenimiento());
        mantenimientoInsertar.setBicicleta(nuevoMantenimiento.getBicicleta());
        mantenimientoInsertar.setPrecio(nuevoMantenimiento.getPrecio());

        mantenimientoRepository.save(mantenimientoInsertar);
        System.out.println("Mantenimiento Actualizado");
    }

    public List<Mantenimiento>getAllMantenimientos(){
        return mantenimientoRepository.findAll();
    }

    public Mantenimiento getMantenimientoById(Long id){

        Optional<Mantenimiento> optionalMantenimiento =  mantenimientoRepository.findById(id);
        if (optionalMantenimiento.isPresent()){
            return optionalMantenimiento.get();
        }
        else {
            throw new Error("Paila nea, No hay ningun mantenimiento");
        }
    }



}


