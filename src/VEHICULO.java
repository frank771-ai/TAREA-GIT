/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frank
 */
/**
 * Clase que representa un vehículo
 * Archivo: Vehiculo.java
 */
public class VEHICULO {
    // Atributos
    public String modelo;
    public String marca;
    public int placa;
    public double costo;
    public int cantidadPuertas;

    /**
     * Constructor de la clase Vehículo
     * @param modelo Modelo del vehículo
     * @param marca Marca del vehículo
     * @param placa Placa del vehículo
     * @param costo Costo del vehículo
     * @param cantidadPuertas Cantidad de puertas del vehículo
     */
    public VEHICULO(String modelo, String marca, int placa, double costo, int cantidadPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.costo = costo;
        this.cantidadPuertas = cantidadPuertas;
    }

    /**
     * Método para mostrar la información del vehículo
     */
    public void mostrarInformacion() {
        System.out.println("Información del Vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Costo: $" + costo);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    // Getters y Setters )
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int  getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
