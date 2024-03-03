package com.Proyecto.proyecto.inventario;

import jakarta.persistence.*;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="direccion", nullable = false)
    private String direccion;

    @Column(name = "sucursal", nullable = false)
    private String sucursal;

    public Inventario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", sucursal='" + sucursal + '\'' +
                '}';
    }
}
