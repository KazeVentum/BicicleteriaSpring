package com.Proyecto.proyecto.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public  ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public void saveProducto(Producto producto){
        productoRepository.save(producto);
    }

    public void deleteProducto(Long id){
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()){
            productoRepository.deleteById(id);
        }
        else {
            throw new Error("Paila rey, no hay registros de Productos con ese ID para eliminar :( ");
        }
    }

    public void updateProducto(Long id, Producto nuevoProducto){
        Producto productoInsertar = productoRepository.findById(id).orElse(null);

        productoInsertar.setNombre(nuevoProducto.getNombre());
        productoInsertar.setPrecio(nuevoProducto.getPrecio());

        productoRepository.save(productoInsertar);
        System.out.println("Producto Actualizado");
    }

    public List<Producto>getAllProducto(){
        return productoRepository.findAll();
    }

    public Producto getProductoById(Long id){

        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()){
            return optionalProducto.get();
        }
        else {
            throw new Error("Paila nea, No hay ningun mantenimiento");
        }
    }
}
