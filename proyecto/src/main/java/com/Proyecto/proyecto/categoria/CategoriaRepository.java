package com.Proyecto.proyecto.categoria;

import com.Proyecto.proyecto.producto.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Query("SELECT p FROM Producto p JOIN p.categorias c WHERE c = :categoria")
    List<Producto> findProductosByCategoria(@Param("categoria") Categoria categoria);
}
