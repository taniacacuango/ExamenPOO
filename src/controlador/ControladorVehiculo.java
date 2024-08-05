/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Vehiculo;
import modelo.Propietario;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControladorVehiculo {
    private Map<Integer, Vehiculo> vehiculos;
    private ControladorPropietario controladorPropietario;
    private Scanner scanner;

    public ControladorVehiculo(ControladorPropietario controladorPropietario) {
        this.vehiculos = new HashMap<>();
        this.controladorPropietario = controladorPropietario;
        this.scanner = new Scanner(System.in);
    }

    // Método para agregar un nuevo vehículo
    public void agregarVehiculo() {
        System.out.print("Ingrese el ID del vehículo: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();

        System.out.print("Ingrese el tipo del vehículo: ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese la cédula del propietario del vehículo: ");
        String cedula = scanner.nextLine();

        Propietario propietario = controladorPropietario.buscarPropietarioPorCedula(cedula);
        if (propietario != null) {
            Vehiculo vehiculo = new Vehiculo(id, placa, tipo, marca, propietario.getPropId());
            vehiculos.put(id, vehiculo);
            System.out.println("Vehículo agregado exitosamente.");
        } else {
            System.out.println("Propietario no encontrado.");
        }
    }

    // Método para mostrar vehículos de un propietario
    public void mostrarVehiculosDePropietario(String cedula) {
        Propietario propietario = controladorPropietario.buscarPropietarioPorCedula(cedula);
        if (propietario != null) {
            System.out.println("Vehículos del propietario con cédula " + cedula + ":");
            boolean vehiculosEncontrados = false;
            for (Vehiculo vehiculo : vehiculos.values()) {
                if (vehiculo.getPropId() == propietario.getPropId()) {
                    System.out.println(vehiculo);
                    vehiculosEncontrados = true;
                }
            }
            if (!vehiculosEncontrados) {
                System.out.println("No se encontraron vehículos para el propietario.");
            }
        } else {
            System.out.println("Propietario no encontrado.");
        }
    }
}
