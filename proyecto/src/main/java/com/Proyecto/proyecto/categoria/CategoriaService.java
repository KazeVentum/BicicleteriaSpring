package com.Proyecto.proyecto.categoria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public void saveCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void deleteCategoria(Long id){
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);
        if (optionalCategoria.isPresent()){
            categoriaRepository.deleteById(id);
            System.out.printf("El ID "+id+" Fue eliminado");
        }
        else {
            throw new Error ("Mangos jefe, no hay registros de Categoria con ese ID para eliminar. ");
        }
    }

    public  void updateCategoria(Long id, Categoria nuevoCategoria){
        Categoria categoriaInsertar = categoriaRepository.findById(id).orElse(null);

        categoriaInsertar.setNombre(nuevoCategoria.getNombre());

        categoriaRepository.save(categoriaInsertar);
        System.out.println("Categoria Actualizada!!!");
    }

    public List<Categoria> getAllCategoria(){
        return categoriaRepository.findAll();
    }

    public Categoria getCategoriaById(Long id){
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);
        if (optionalCategoria.isPresent()){
            return optionalCategoria.get();
        }
        else {
            throw new Error ("Paila nea, No hay ninguna Categoria con ese ID registrado");
        }
    }

}
