package Servicios;

import java.util.Scanner;

public interface MenuInterfaz {
	/*
	 * Mostrara la implementacion del menu para seleccionar otros menus awb -010324
	 */
	public int menuSeleccionMenus(Scanner sc);

	/*
	 * Mostrala la imlementacion del menu empleado awb - 010324
	 */
	public int menuEmpleado(Scanner sc);

	/*
	 * Mostrala la imlementacion del menu gerencia awb - 010324
	 */
	public int menuGerencia(Scanner sc);
}
