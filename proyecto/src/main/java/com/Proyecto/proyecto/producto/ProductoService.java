package com.Proyecto.proyecto.producto;

import com.Proyecto.proyecto.categoria.Categoria;
import com.Proyecto.proyecto.categoria.CategoriaRepository;
import com.Proyecto.proyecto.categoria.CategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public  ProductoService(ProductoRepository productoRepository, CategoriaRepository categoriaRepository){
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
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
            throw new Error("Paila nea, No hay ningun Producto");
        }
    }

    @Transactional                                                                           // Cuando hay dos consultas presentes en un mismo metodo, se usa "Transational"
    public void insertCategoria(Long categoriaId, Long productoId){

        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        Producto producto = productoRepository.findById(productoId).orElse(null);

        if (categoria != null && producto != null){
           categoria.getProductos().add(producto);
           producto.getCategorias().add(categoria);
        }
    }
}
