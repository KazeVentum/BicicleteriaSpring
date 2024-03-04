package com.Proyecto.proyecto;

import com.Proyecto.proyecto.bicicleta.Bicicleta;
import com.Proyecto.proyecto.bicicleta.BicicletaService;
import com.Proyecto.proyecto.categoria.Categoria;
import com.Proyecto.proyecto.categoria.CategoriaService;
import com.Proyecto.proyecto.cliente.Cliente;
import com.Proyecto.proyecto.cliente.ClienteService;
import com.Proyecto.proyecto.factura.Factura;
import com.Proyecto.proyecto.factura.FacturaService;
import com.Proyecto.proyecto.inventario.Inventario;
import com.Proyecto.proyecto.inventario.InventarioService;
import com.Proyecto.proyecto.inventarioXproducto.InventarioXProducto;
import com.Proyecto.proyecto.inventarioXproducto.InventarioXProductoService;
import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import com.Proyecto.proyecto.mantenimiento.MantenimientoService;
import com.Proyecto.proyecto.producto.Producto;
import com.Proyecto.proyecto.producto.ProductoService;
import com.Proyecto.proyecto.productoXfactura.ProductoXFactura;
import com.Proyecto.proyecto.productoXfactura.ProductoXFacturaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(ProyectoApplication.class, args);


//		Creacion de servicios!
		BicicletaService bicicletaService = contexto.getBean(BicicletaService.class);
		MantenimientoService mantenimientoService = contexto.getBean(MantenimientoService.class);
		InventarioService inventarioService = contexto.getBean(InventarioService.class);
		ClienteService clienteService = contexto.getBean(ClienteService.class);
		ProductoService productoService = contexto.getBean(ProductoService.class);
		CategoriaService categoriaService = contexto.getBean(CategoriaService.class);
		FacturaService facturaService = contexto.getBean(FacturaService.class);
		ProductoXFacturaService productoXFacturaService = contexto.getBean(ProductoXFacturaService.class);
		InventarioXProductoService inventarioXProductoService = contexto.getBean(InventarioXProductoService.class);

// 		Creacion de Objetos
		Bicicleta bicicleta = new Bicicleta();
		Mantenimiento mantenimiento = new Mantenimiento();
		Inventario inventario = new Inventario();
		Cliente cliente = new Cliente();
		Producto producto = new Producto();
		Categoria categoria = new Categoria();
		Factura factura = new Factura();


//// ----- CREACION DE OBJETOS ------

////	Crear Bicicleta
//		bicicleta.setMarca("pro de cicla");
//		bicicleta.setNumeroDelMarco("005A");

////	Crear Mantenimiento
//		mantenimiento.setTipoMantenimiento("Mantenimiento Baratico");
//		mantenimiento.setBicicleta(bicicletaService.getBicicletaById(5L));
//		mantenimiento.setPrecio(30000.0);

////	Crear Objeto Inventario
//		inventario.setDireccion("Calle 122 # 342 - 01");
//		inventario.setSucursal("Pasto");

////	Crear Objeto Cliente
//		cliente.setNombre("Pollo");
//		cliente.setCiudad("Bogota");
//		cliente.setEmail("Ancreem@gmail.com");

////    Crear Objeto Producto
//		producto.setNombre("Cadena");
//		producto.setPrecio(50000.0);

////	Crear Objeto Categoria
//		categoria.setNombre("Partes de bicicleta");

//		Crear Objeto Factura
//		factura.setCliente(clienteService.getClienteById(3L));
//		factura.setFecha(LocalDate.now());
//		factura.setTotalPagar(50000.0);
//		factura.setMantenimiento(mantenimientoService.getMantenimientoById(3L));

//		Crear ProductoXFactura




////-------	CRUD Bicicleta  ---------

////	Guardar Bicicleta
//		bicicletaService.saveBicicleta(bicicleta);

////	Eliminar Bicicleta
//		bicicletaService.deleteBicicleta(1L);

////	Actualizar Bicicleta
//		bicicletaService.updateBicicleta(1L, bicicleta);

////	Consultar bicicleta por Id
//		System.out.println(bicicletaService.getBicicletaById(1L));

////	Consultar todas las bicicletas
//		List<Bicicleta> bicicletasObj = bicicletaService.getAllBicicletas();
//		for (Bicicleta bicicletaList : bicicletasObj){
//			System.out.println(bicicletaList);
//		}


////-------	CRUD Mantenimiento ----------

////	Guardar Mantenimiento
//		mantenimientoService.saveMantenimiento(mantenimiento);

//// 	Actualizar Mantenimiento
//		mantenimientoService.updateMantenimiento(2L, mantenimiento);

////	Consultar mantenimiento por Id
//		System.out.println(mantenimientoService.getMantenimientoById(2L));

////	Consultar Todos los Mantenimientos
//		List<Mantenimiento> mantenimientosObj = mantenimientoService.getAllMantenimientos();
//		for (Mantenimiento mantenimientosList : mantenimientosObj) {
//			System.out.println(mantenimientosList);
//		}


////-------	CRUD Inventario ----------

////	Guardar Inventario
//		inventarioService.saveInventario(inventario);

////	Eliminar Inventario
//		inventarioService.deleteInventario(3L);

//// 	Actualizar Inventario
//		inventarioService.updateInventario(1L, inventario);

////	Consultar Inventario por Id
//		System.out.println(inventarioService.getInventarioById(2L));

////	Consultar Todos los Mantenimientos
//		List<Inventario> inventariosObj = inventarioService.getAllInventarios();
//		for (Inventario inventarioList : inventariosObj) {
//			System.out.println(inventarioList);
//		}

////-------	CRUD Cliente ----------

////	Guardar Cliente
//		clienteService.saveCliente(cliente);

////	Eliminar Cliente
//		clienteService.deleteCliente(1L);

////	Actualizar Cliente
//		clienteService.updateCliente(2L, cliente);

//		Consultar Cliente por Id
//		System.out.println(clienteService.getClienteById(2L));

////	Consultar todos los Clientes
//		List<Cliente> clienteObj = clienteService.getAllClientes();
//		for (Cliente clienteList : clienteObj) {
//			System.out.println(clienteList);
//		}


//////-------	CRUD Producto ----------
//
////	Guardar Producto
//		productoService.saveProducto(producto);

////	Eliminar Producto
//		productoService.deleteProducto(1L);

////	Actualizar Producto
//		productoService.updateProducto(2L, producto);

////	Consultar Producto por Id
//		System.out.println(productoService.getProductoById(2L));

////	Consultar todos los Producto
//		List<Producto> productoObj = productoService.getAllProducto();
//		for (Producto productoList : productoObj) {
//			System.out.println(productoList);
//		}


//////-------	CRUD Categoria ----------
//
////	Guardar Categoria
//		categoriaService.saveCategoria(categoria);

////	Eliminar Categoria
//		categoriaService.deleteCategoria(1L);

////	Actualizar Categoria
//		categoriaService.updateCategoria(2L, categoria);

////	Consultar Categoria por Id
//		System.out.println(categoriaService.getCategoriaById(2L));

////	Consultar todos los Categorias
//		List<Categoria> categoriaObj = categoriaService.getAllCategoria();
//		for (Categoria categoriaList : categoriaObj) {
//			System.out.println(categoriaList);
//		}


////// -------	CRUD Factura ----------

////	Guardar Factura
//		facturaService.saveFactura(factura);

////	Eliminar Factura
//		facturaService.deleteFactura(1L);

////	Actualizar Factura
//		facturaService.updateFactura(2L, factura);

////	Consultar Factura por Id
//		System.out.println(facturaService.getFacturaById(3L));

////	Consultar todos los Facturas
//		List<Factura> facturasObj = facturaService.getAllFactura();
//		for (Factura facturaList : facturasObj) {
//			System.out.println(facturaList);
//		}


////// -------	CRUD ProductoXFactura ----------
//		productoXFacturaService.saveProductoXFactura(productoService.getProductoById(1L), facturaService.getFacturaById(3L), 2);

////// -------	CRUD CategoriaXProducto ----------
//		productoService.insertCategoria(1L, 1L);

////// -------	CRUD inventarioXProducto ----------
//		inventarioXProductoService.saveInventarioXProducto(inventarioService.getInventarioById(2L), productoService.getProductoById(2L), 5);

	}
}
