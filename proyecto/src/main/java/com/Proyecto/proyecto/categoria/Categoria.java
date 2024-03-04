package com.Proyecto.proyecto.categoria;

import com.Proyecto.proyecto.producto.Producto;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "productoxcategoria",                       // Crea la tabla intermedia o Muchos a muchos
                joinColumns = @JoinColumn(name = "categoria_id"), // Aca es la tabla del punto de partida
                inverseJoinColumns = @JoinColumn(name = "producto_id") // Aca va la tabla inversa o espejo
            )
    private Set<Producto> productos;  // Set es un tipo de lista que EVITA duplicidad.

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", productos=" + productos +
                '}';
    }
}
