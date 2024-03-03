package com.Proyecto.proyecto;

import com.Proyecto.proyecto.bicicleta.Bicicleta;
import com.Proyecto.proyecto.bicicleta.BicicletaService;
import com.Proyecto.proyecto.cliente.Cliente;
import com.Proyecto.proyecto.cliente.ClienteService;
import com.Proyecto.proyecto.inventario.Inventario;
import com.Proyecto.proyecto.inventario.InventarioService;
import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import com.Proyecto.proyecto.mantenimiento.MantenimientoService;
import com.Proyecto.proyecto.producto.Producto;
import com.Proyecto.proyecto.producto.ProductoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

// 		Creacion de Objetos
		Bicicleta bicicleta = new Bicicleta();
		Mantenimiento mantenimiento = new Mantenimiento();
		Inventario inventario = new Inventario();
		Cliente cliente = new Cliente();
		Producto producto = new Producto();




//// ----- CREACION DE OBJETOS ------

////	Crear Bicicleta
//		bicicleta.setMarca("pro de cicla");
//		bicicleta.setNumeroDelMarco("005A");


////	Crear Mantenimiento
//		mantenimiento.setTipoMantenimiento("Chimba de mantenimiento");
//		mantenimiento.setBicicleta(bicicletaService.getBicicletaById(3L));
//		mantenimiento.setPrecio(2500.0);

////	Crear Objeto Inventario
//		inventario.setDireccion("Calle 122 # 342 - 01");
//		inventario.setSucursal("Pasto");

////		Crear Objeto Cliente
//
//		cliente.setNombre("daniel");
//		cliente.setCiudad("Bogota");
//		cliente.setEmail("daniel@gmail.com");

////    Crear Objeto Producto

		producto.setNombre("Pedales");
		producto.setPrecio(10000.00);



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

////	Eliminar Mantenimiento
//		mantenimientoService.deleteMantenimiento(1L);

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
//
////	Eliminar Producto
//		productoService.deleteProducto(1L);
//
////	Actualizar Producto
//		productoService.updateProducto(2L, producto);
//
////	Consultar Producto por Id
//		System.out.println(productoService.getProductoById(2L));
//
////	Consultar todos los Producto
//		List<Producto> productoObj = productoService.getAllProducto();
//		for (Producto productoList : productoObj) {
//			System.out.println(productoList);
//		}

	}
}
