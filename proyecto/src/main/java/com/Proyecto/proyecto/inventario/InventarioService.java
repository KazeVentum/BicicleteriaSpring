package com.Proyecto.proyecto.inventario;

import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    private final InventarioRepository inventarioRepository;

    @Autowired // Inyeccion automatica cuando se realiza una instancia de este objeto.
    public InventarioService(InventarioRepository inventarioRepository){
        this.inventarioRepository = inventarioRepository;
    }

    public void saveInventario(Inventario inventario){
        inventarioRepository.save(inventario);
    }

    public void deleteInventario(Long id){
        Optional<Inventario> optionalInventario =  inventarioRepository.findById(id);
        if (optionalInventario.isPresent()){
            inventarioRepository.deleteById(id);
            System.out.println("El ID "+id+" Fue eliminado");
        }
        else {
            throw new Error("Mangos jefe, no hay registros de inventario con ese ID para eliminar. ");
        }
    }

    public void updateInventario(Long id, Inventario nuevoInventario){
        Inventario inventarioInsertar = inventarioRepository.findById(id).orElse(null);

        inventarioInsertar.setDireccion(nuevoInventario.getDireccion());
        inventarioInsertar.setSucursal(nuevoInventario.getSucursal());

        inventarioRepository.save(inventarioInsertar);
        System.out.println("Inventario Actualizado!!!");
    }

    public List<Inventario> getAllInventarios(){
        return  inventarioRepository.findAll();
    }

    public Inventario getInventarioById(Long id) {

        Optional<Inventario> optionalInventario =  inventarioRepository.findById(id);
        if (optionalInventario.isPresent()){
            return optionalInventario.get();
        }
        else {
            throw new Error("Paila nea, No hay ningun inventario con ese ID registrado");
        }
    }
}
