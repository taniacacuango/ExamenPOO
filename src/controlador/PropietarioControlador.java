/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControladorPropietario {
    private Map<String, Propietario> propietarios;
    private Scanner scanner;
    private ConexionBDD conexionBDD;

    public ControladorPropietario() {
        this.propietarios = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.conexionBDD = new ConexionBDD();
    }

    // Método para agregar un nuevo propietario
    public void agregarPropietario() {
        System.out.print("Ingrese el ID del propietario: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del propietario: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la cédula del propietario: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese el teléfono del propietario: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese la dirección del propietario: ");
        String direccion = scanner.nextLine();

        Propietario propietario = new Propietario(id, nombre, apellido, cedula, telefono, direccion);
        propietarios.put(cedula, propietario);
        System.out.println("Propietario agregado exitosamente.");
    }

    // Método para buscar un propietario por su cédula
    public Propietario buscarPropietarioPorCedula(String cedula) {
        Propietario propietario = propietarios.get(cedula);
        if (propietario != null) {
            System.out.println(propietario);
        } else {
            System.out.println("Propietario no encontrado.");
        }
        return propietario;
    }
}
