package com.Proyecto.proyecto;

import com.Proyecto.proyecto.bicicleta.Bicicleta;
import com.Proyecto.proyecto.bicicleta.BicicletaService;
import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import com.Proyecto.proyecto.mantenimiento.MantenimientoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(ProyectoApplication.class, args);


//		Creacion de servicios!
		BicicletaService bicicletaService = contexto.getBean(BicicletaService.class);
		MantenimientoService mantenimientoService = contexto.getBean(MantenimientoService.class);

// 		Creacion de Objetos
		Bicicleta bicicleta = new Bicicleta();
		Mantenimiento mantenimiento = new Mantenimiento();


////	Crear Bicicleta
//		bicicleta.setMarca("ASUS-RogStrick");
//		bicicleta.setNumeroDelMarco("002B");


////	Crear Mantenimiento
//		mantenimiento.setTipoMantenimiento("Chimba de mantenimiento");
//		mantenimiento.setBicicleta(bicicletaService.getBicicletaById(3L));
//		mantenimiento.setPrecio(2500.0);


////	CRUD Bicicleta

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


////	CRUD Mantenimiento

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


	}


}
