package com.Proyecto.proyecto.inventarioXproducto;

import com.Proyecto.proyecto.inventario.Inventario;
import com.Proyecto.proyecto.producto.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioXProductoService {

    private final InventarioXProductoRepository inventarioXproductoRepository;

    @Autowired
    public InventarioXProductoService(InventarioXProductoRepository inventarioXproductoRepository) {
        this.inventarioXproductoRepository = inventarioXproductoRepository;
    }

    public void saveInventarioXProducto(Inventario inventario, Producto producto, int cantidad){


        InventarioProductoId inventarioProductoId = new InventarioProductoId();

        inventarioProductoId.setInventarioId(inventario.getId());
        inventarioProductoId.setProductoId(producto.getId());

        InventarioXProducto inventarioXproducto = new InventarioXProducto();

        inventarioXproducto.setId(inventarioProductoId);
        inventarioXproducto.setInventario(inventario);
        inventarioXproducto.setProducto(producto);
        inventarioXproducto.setCantidad(cantidad);

        inventarioXproductoRepository.save(inventarioXproducto);

    }


}
