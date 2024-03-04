package com.Proyecto.proyecto.productoXfactura;

import com.Proyecto.proyecto.factura.Factura;
import com.Proyecto.proyecto.producto.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoXFacturaService {

    private final ProductoXFacturaRepository productoXFacturaRepository;

    @Autowired
    public ProductoXFacturaService(ProductoXFacturaRepository productoXFacturaRepository){
        this.productoXFacturaRepository = productoXFacturaRepository;
    }

    public void saveProductoXFactura(Producto producto, Factura factura, int cantidad){

        ProductoFacturaId productoFacturaId = new ProductoFacturaId();

        productoFacturaId.setProductoId(producto.getId());
        productoFacturaId.setFacturaId(factura.getId());

        ProductoXFactura productoXFactura = new ProductoXFactura();

        productoXFactura.setId(productoFacturaId);
        productoXFactura.setProducto(producto);
        productoXFactura.setFactura(factura);
        productoXFactura.setCantidad(cantidad);

        productoXFacturaRepository.save(productoXFactura);
    }

}
