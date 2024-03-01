package Servicios;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import Dto.pedidoDto;
import Dto.ventasDto;

public class OperativaImplementacion implements OperativaInterfaz {

	int idVenta = 0;

	/*
	 * Metodo que se encarga de añadir las ventas a la lista (Empleado) awb - 010324
	 */
	public void añadirVenta(Scanner sc, List<ventasDto> ventasLista) {

		ventasDto nuevaVenta = new ventasDto();
		System.out.println("Importe de la venta: ");
		nuevaVenta.setImporteVenta(sc.nextFloat());
		LocalDateTime fechaHoy = LocalDateTime.now();
		nuevaVenta.setFechaVenta(fechaHoy);
		idVenta = idVenta + 1;
		nuevaVenta.setIdVenta(idVenta);
		ventasLista.add(nuevaVenta);
	}

	/*
	 * Metodo que se encargar de mostrar por consola todas las ventas del dia
	 * indicado (Empleado) awb - 010324
	 */

	public void calculoTotalVentas(Scanner sc, List<ventasDto> ventasLista) {
		float totalImporte = 0;
		System.out.println("Que fecha desea indicar: (dd-MM-yyyy) ");
		String fecha = sc.next();

		for (ventasDto recorrido : ventasLista) {
			if (fecha.equals(recorrido.getFechaVenta())) {
				totalImporte = recorrido.importeVenta + totalImporte;
			}
			System.out.println("Total importe de ese dia: " + totalImporte);
		}

	}

	/*
	 * Metodo que se encargara de mostrar por consola todas las ventas del dia
	 * (Gerencia) awb - 010324
	 */
	public void mostrarVentasDia(Scanner sc, List<pedidoDto> pedidosLista) {

	}

	/*
	 * Metodo que se encargara de realizar los pedidos a los proveedores (Gerencia)
	 * awb - 010324
	 */
	int idPedido = 0;

	public void crearPedidoProveedores(Scanner sc, List<pedidoDto> pedidosLista) {
		boolean ejecutarPedidos = false;
		do {
			pedidoDto pedidoNuevo = new pedidoDto();

			System.out.println("Nombre del producto: ");
			String nombreProducto = sc.next();
			pedidoNuevo.setProducto(nombreProducto);

			System.out.println("Cantidad del producto: ");
			int cantidadProducto = sc.nextInt();
			pedidoNuevo.setCantidadProducto(cantidadProducto);

			System.out.println("Fecha deseada de entrega (dd-MM-yyyy): ");
			String fechaEntrega = sc.next();
			pedidoNuevo.setFechaEntrega(fechaEntrega);

			idPedido = idPedido + 1;
			pedidoNuevo.setIdPedido(idPedido);

			pedidosLista.add(pedidoNuevo);

			System.out.println("¿Desea seguir añadiendo pedidos? (s/n)");
			if (sc.next().equals("n")) {
				ejecutarPedidos = true;
			}

		} while (!ejecutarPedidos);
		for (pedidoDto pedido : pedidosLista) {
			System.out.println("Producto: " + pedido.getProducto());
			System.out.println("Cantidad: " + pedido.getCantidadProducto() + " unidades");
			System.out.println("Fecha entrega: " + pedido.getFechaEntrega());
		}
	}

}
