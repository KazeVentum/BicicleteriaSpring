package com.Proyecto.proyecto.inventarioXproducto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InventarioProductoId implements Serializable {

    @Column(name= "producto_id", nullable = false)
    private Long productoId;

    @Column(name = "inventario_id", nullable = false)
    private Long inventarioId;

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(Long inventarioId) {
        this.inventarioId = inventarioId;
    }
}
