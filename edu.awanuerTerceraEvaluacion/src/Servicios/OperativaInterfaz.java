package Servicios;

import java.util.List;
import java.util.Scanner;

import Dto.pedidoDto;
import Dto.ventasDto;

public interface OperativaInterfaz {

	/*
	 * Se añadiran las ventas a la lista
	 * awb - 010324
	 */
	public void añadirVenta(Scanner sc, List<ventasDto> ventasLista);
	
	/*
	 * Aqui se calculara el total de ventas de un dia en especifico
	 * awb - 010324
	 */
	public void calculoTotalVentas(Scanner sc, List<ventasDto> ventasLista);
	
	/*
	 * Aqui se mostraran todas las ventas del dia
	 * awb - 010324
	 */
	public void mostrarVentasDia(Scanner sc, List<pedidoDto> pedidosLista);
	
	/*
	 * Con este metodo se podrán crear pedidos
	 * awb - 010324
	 */
	public void crearPedidoProveedores(Scanner sc, List<pedidoDto> pedidosLista);
}
