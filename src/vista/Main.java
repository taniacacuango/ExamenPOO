/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author PC19
 */

import controlador.ControladorPropietario;
import controlador.ControladorVehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorPropietario propietarioController = new ControladorPropietario(); 
        ControladorVehiculo vehiculoController = new ControladorVehiculo(propietarioController);

        while (true) {
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Agregar Propietario");
            System.out.println("2. Buscar Propietario por Cédula");
            System.out.println("3. Agregar Vehículo");
            System.out.println("4. Mostrar Vehículos de Propietario");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Agregar propietario
                    propietarioController.agregarPropietario();
                    break;
                case 2:
                    // Buscar propietario por cédula
                    System.out.print("Ingrese la cédula del propietario: ");
                    String cedula = scanner.nextLine();
                    propietarioController.buscarPropietarioPorCedula(cedula);
                    break;
                case 3:
                    // Agregar vehículo
                    vehiculoController.agregarVehiculo();
                    break;
                case 4:
                    // Mostrar vehículos del propietario
                    System.out.print("Ingrese la cédula del propietario: ");
                    String cedulaPropietario = scanner.nextLine();
                    vehiculoController.mostrarVehiculosDePropietario(cedulaPropietario);
                    break;
                case 5:
                    // Salir de la aplicación
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        }
    }
}
