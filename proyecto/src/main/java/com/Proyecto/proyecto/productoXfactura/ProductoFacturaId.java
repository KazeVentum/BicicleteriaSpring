package com.Proyecto.proyecto.productoXfactura;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductoFacturaId implements Serializable {

    @Column(name = "producto_id", nullable = false)
    private Long productoId;
    @Column(name = "factura_id", nullable = false)
    private Long facturaId;

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }
}
