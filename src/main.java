/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frank
 */
public class main  {
    public static void main(String[] args) {
        // 1. Crear vehículos
        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 2020);
        Vehiculo auto2 = new Vehiculo("Nissan", "Sentra", 2021);

        // 2. Crear concesionario y agregar vehículos
        Concesionario concesionario = new Concesionario();
        concesionario.agregarVehiculo(auto1);
        concesionario.agregarVehiculo(auto2);

        // 3. Crear cliente
        Cliente cliente = new Cliente("Juan Pérez");

        // 4. Simular proceso
        System.out.println("Vehículos disponibles:");
        concesionario.mostrarInventario();

        System.out.println("\nCliente mira un vehículo:");
        cliente.verVehiculo(auto1);

        System.out.println("\nCliente compra el vehículo:");
        cliente.comprarVehiculo(auto1, concesionario);
        System.out.println("HOLA MUNDO");
    }
}

class Vehiculo {
    String marca;
    String modelo;
    int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
}

class Concesionario {
    Vehiculo[] inventario = new Vehiculo[10];
    int cantidad = 0;

    public void agregarVehiculo(Vehiculo v) {
        inventario[cantidad++] = v;
    }

    public void mostrarInventario() {
        for (int i = 0; i < cantidad; i++) {
            Vehiculo v = inventario[i];
            System.out.println(v.marca + " " + v.modelo + " (" + v.año + ")");
        }
    }

    public boolean venderVehiculo(Vehiculo v) {
        for (int i = 0; i < cantidad; i++) {
            if (inventario[i] == v) {
                // Eliminar moviendo los elementos
                for (int j = i; j < cantidad - 1; j++) {
                    inventario[j] = inventario[j + 1];
                }
                cantidad--;
                return true;
            }
        }
        return false;
    }
}

class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void verVehiculo(Vehiculo v) {
        System.out.println("Viendo: " + v.marca + " " + v.modelo);
    }

    public void comprarVehiculo(Vehiculo v, Concesionario c) {
        if (c.venderVehiculo(v)) {
            System.out.println(nombre + " compró: " + v.marca + " " + v.modelo);
        } else {
            System.out.println("No se pudo completar la compra");
        }
    }
}