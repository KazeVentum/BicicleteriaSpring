package com.Proyecto.proyecto.factura;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    @Autowired
    public FacturaService(FacturaRepository facturaRepository){
        this.facturaRepository = facturaRepository;
    }

    public void saveFactura(Factura factura){
        facturaRepository.save(factura);
    }

    public void deleteFactura(Long id){
        Optional<Factura> optionalFactura =  facturaRepository.findById(id);
        if (optionalFactura.isPresent()){
            facturaRepository.deleteById(id);
        }
        else {
            throw new Error("Paila rey, no hay registros de Facturas con ese ID para eliminar :( ");
        }
    }

    public void updateFactura (Long id, Factura nuevaFactura){
        Factura facturaInsertar = facturaRepository.findById(id).orElse(null);

        facturaInsertar.setCliente(nuevaFactura.getCliente());
        facturaInsertar.setFecha(nuevaFactura.getFecha());
        facturaInsertar.setTotalPagar(nuevaFactura.getTotalPagar());
        facturaInsertar.setMantenimiento(nuevaFactura.getMantenimiento());

        facturaRepository.save(facturaInsertar);
        System.out.println("Factura Actualizada!!!");

    }

    public List<Factura> getAllFactura(){
        return facturaRepository.findAll();
    }

    public Factura getFacturaById(Long id){

        Optional<Factura> optionalFactura =  facturaRepository.findById(id);
        if (optionalFactura.isPresent()){
            return optionalFactura.get();
        }
        else {
            throw new Error("Paila nea, No hay ninguna Factura con ese ID.");
        }
    }


}
