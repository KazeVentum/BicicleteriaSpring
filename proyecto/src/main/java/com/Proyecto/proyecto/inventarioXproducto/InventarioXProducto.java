package com.Proyecto.proyecto.inventarioXproducto;

import com.Proyecto.proyecto.inventario.Inventario;
import com.Proyecto.proyecto.producto.Producto;
import com.Proyecto.proyecto.productoXfactura.ProductoFacturaId;
import jakarta.persistence.*;

@Entity
public class InventarioXProducto {
    @EmbeddedId
    private InventarioProductoId id;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @MapsId("inventarioId")
    @JoinColumn(name = "inventario_id")
    private Inventario inventario;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    public InventarioXProducto() {
    }

    public InventarioProductoId getId() {
        return id;
    }

    public void setId(InventarioProductoId id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "inventarioXproducto{" +
                "id=" + id +
                ", producto=" + producto +
                ", inventario=" + inventario +
                ", cantidad=" + cantidad +
                '}';
    }
}
