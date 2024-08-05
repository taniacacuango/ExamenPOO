/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Vehiculo {
    private int vehiId;
    private String placa;
    private String tipo;
    private String marca;
    private int propId; // ID del propietario asociado

    // Constructor
    public Vehiculo(int vehiId, String placa, String tipo, String marca, int propId) {
        this.vehiId = vehiId;
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.propId = propId;
    }

    // Getters y Setters
    public int getVehiId() {
        return vehiId;
    }

    public void setVehiId(int vehiId) {
        this.vehiId = vehiId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPropId() {
        return propId;
    }

    public void setPropId(int propId) {
        this.propId = propId;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vehiId=" + vehiId +
                ", placa='" + placa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", propId=" + propId +
                '}';
    }
}
