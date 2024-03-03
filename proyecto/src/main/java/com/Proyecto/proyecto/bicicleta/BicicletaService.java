package com.Proyecto.proyecto.bicicleta;

import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import com.Proyecto.proyecto.mantenimiento.MantenimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // SI no hay un @Service, no se crea un Bean.
public class BicicletaService {

    private final BicicletaRepository bicicletaRepository;
    @Autowired  // Inyeccion automatica cuando se realiza una instancia de este objeto.
    public BicicletaService(BicicletaRepository bicicletaRepository) {
        this.bicicletaRepository = bicicletaRepository;
    }

    public void saveBicicleta(Bicicleta bicicleta){
        bicicletaRepository.save(bicicleta);
    }

    public void deleteBicicleta(Long id){
        Optional<Bicicleta> optionalBicicleta =  bicicletaRepository.findById(id);
        if (optionalBicicleta.isPresent()){
            bicicletaRepository.deleteById(id);
        }
        else {
            throw new Error("Paila nea, No hay ninguna bicicleta para eliminar con ese Id");
        }
    }

    public void updateBicicleta(Long id, Bicicleta nuevaBicicleta){
        Bicicleta bicicletaInsertar = bicicletaRepository.findById(id).orElse(null);

        bicicletaInsertar.setNumeroDelMarco(nuevaBicicleta.getNumeroDelMarco());
        bicicletaInsertar.setMarca(nuevaBicicleta.getMarca());

        bicicletaRepository.save(bicicletaInsertar);
        System.out.println("Bicicleta Actualizada");
    }

    public List<Bicicleta> getAllBicicletas(){
        return bicicletaRepository.findAll();
    }

    public Bicicleta getBicicletaById(Long id){
        Optional<Bicicleta> optionalBicicleta =  bicicletaRepository.findById(id);
        if (optionalBicicleta.isPresent()){
            return  optionalBicicleta.get();
        }
        else {
            throw new Error("Paila nea, No existe ninguna bicicleta con ese Id");
        }
    }

}

