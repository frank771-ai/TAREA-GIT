/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frank
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consesionario {
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private List<VEHICULO> inventario;
    private List<Venta> ventasRealizadas;

    // Constructor
    public Consesionario(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.inventario = new ArrayList<>();
        this.ventasRealizadas = new ArrayList<>();
    }

    // Métodos principales

    /**
     * Agrega un vehículo al inventario del concesionario
     * @param vehiculo El vehículo a agregar
     */
    public void agregarVehiculo(VEHICULO vehiculo) {
        inventario.add(vehiculo);
        System.out.println("Vehículo agregado al inventario: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

    /**
     * Vende un vehículo a un cliente
     * @param VEHICULO El vehículo a vender
     * @return true si la venta fue exitosa, false en caso contrario
     */
   public boolean venderVehiculo(Vehiculo vehiculo) {
    if (inventario.contains(vehiculo)) {
        inventario.remove(vehiculo);
        Venta nuevaVenta = new Venta(vehiculo, LocalDate.now()); //
        ventasRealizadas.add(nuevaVenta);
        return true;
    }
    return false;
}

private static class Venta {
    private final Vehiculo vehiculo;
    private final LocalDate fechaVenta; 
    
    public Venta(Vehiculo vehiculo, LocalDate fechaVenta) {
        this.vehiculo = vehiculo;
        this.fechaVenta = fechaVenta;
    }
}
    /**
     * Muestra el inventario actual de vehículos
     */
    public void mostrarInventario() {
        System.out.println("\nInventario del concesionario " + nombre + ":");
        if (inventario.isEmpty()) {
            System.out.println("No hay vehículos en el inventario.");
            return;
        }
        
        for (int i = 0; i < inventario.size(); i++) {
            VEHICULO v = inventario.get(i);
            System.out.println((i + 1) + ". " + v.getMarca() + " " + v.getModelo() + 
                             " - Año: " + v.getModelo() + " - Precio: $" + v.getCosto());
        }
    }

    /**
     * Busca vehículos por marca
     * @param marca La marca a buscar
     * @return Lista de vehículos que coinciden con la marca
     */
    public List<VEHICULO> buscarPorMarca(String marca) {
        List<VEHICULO> resultados = new ArrayList<>();
        for (VEHICULO v: inventario) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                resultados.add(v);
            }
        }
        return resultados;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<VEHICULO> getInventario() {
        return new ArrayList<>(inventario); // Devuelve una copia para proteger el original
    }

    // Clase interna para manejar las ventas
    private static class Venta {
        private VEHICULO  VEHICULO;
        private LocalDate fechaVenta;

        public Venta(VEHICULO vehiculo, LocalDate fechaVenta) {
            this.VEHICULO = vehiculo;
            this.fechaVenta = fechaVenta;
        }

        // Getters para Venta
        public VEHICULO getVehiculo() {
            return VEHICULO;
        }

        public LocalDate getFechaVenta() {
            return fechaVenta;
        }
    }
}
