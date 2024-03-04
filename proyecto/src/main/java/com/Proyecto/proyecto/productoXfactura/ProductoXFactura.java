package com.Proyecto.proyecto.productoXfactura;

import com.Proyecto.proyecto.factura.Factura;
import com.Proyecto.proyecto.producto.Producto;
import jakarta.persistence.*;

@Entity
public class ProductoXFactura {
    @EmbeddedId
    private ProductoFacturaId id;

    @ManyToOne
    @MapsId ("productoId")
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @MapsId ("facturaId")
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    public ProductoXFactura() {
    }

    public ProductoFacturaId getId() {
        return id;
    }

    public void setId(ProductoFacturaId id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ProductoXFactura{" +
                "id=" + id +
                ", producto=" + producto +
                ", factura=" + factura +
                ", cantidad=" + cantidad +
                '}';
    }
}
