package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	/*
	 * Metodo encargado de mostrar por consola el menu para seleccionar los distintos
	 * submenus de la aplicacion
	 * awb - 010324
	 */
	public int menuSeleccionMenus(Scanner sc) {
		int seleccion;
		System.out.println("Que menu desea usar: ");
		System.out.println("0.Cerrar menu ");
		System.out.println("1.Menu gerencia ");
		System.out.println("2.Menu empleado ");
		seleccion = sc.nextInt();
		return seleccion;
	}


	/*
	 * Metodo encargado de mostrar el menu (Gerencia)
	 * awb - 010324
	 */
	public int menuGerencia(Scanner sc) {
		int seleccion;
		System.out.println("(MENU GERENCIA)");
		System.out.println("Que desea hacer: ");
		System.out.println("0.Cerrar menu ");
		System.out.println("1.Mostrar todas las ventas del dia ");
		System.out.println("2.Crear un nuevo pedido a proveedores ");
		seleccion = sc.nextInt();
		return seleccion;
	}


	/*
	 * Metodo encargado de mostrar el menu (Empleado)
	 * awb - 010324
	 */
	public int menuEmpleado(Scanner sc) {
		int seleccion;
		System.out.println("(MENU EMPLEADO)");
		System.out.println("Que desea hacer: ");
		System.out.println("0.Cerrar menu ");
		System.out.println("1.Cálculo total de ventas diario ");
		System.out.println("2.Añadir venta ");
		seleccion = sc.nextInt();
		return seleccion;
	}
}
