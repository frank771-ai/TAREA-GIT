/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frank
 */
public class cliente {
// atributos
private String nombre;
private String direccion;
private String email;
private int telefono;
private int identificacion;

// constructor 
 /*constructor de la clase cliente 
 @param nombre nombre del cliente 
 @param direccion direccion del cliente
 @param email es el correo electronico de el cliente
 @param telefono es el telefono de el cliente 
 @param identificacion es la identificacion del cliente 
 */
public cliente(String nombre,String direccion, String email,int telefono,int identificacion) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.email = email;
    this.telefono = telefono;
    this.identificacion = identificacion;
  }

 public void verInformacionVehiculo(VEHICULO vehiculo) {
        System.out.println("Información del vehículo:");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo()); 
        System.out.println("Precio: " + vehiculo.getCosto());
        System.out.println("Color: " + vehiculo.getPlaca());
      
    }
    
    /**
     * Realiza la compra de un vehículo
     * @param vehiculo El vehículo a comprar
     * @param consesionario El concesionario donde se realiza la compra
     * @return true si la compra fue exitosa, false en caso contrario
     */
    public boolean comprarVehiculo(VEHICULO vehiculo, Consesionario consesionario) {
        if (consesionario.venderVehiculo(vehiculo)) {
            System.out.println("¡Felicidades " + nombre + "! Has comprado el vehículo " + 
                              vehiculo.getMarca() + " " + vehiculo.getModelo());
            return true;
        } else {
            System.out.println("Lo sentimos, no se pudo completar la compra del vehículo.");
            return false;
        }
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
    
    public int  getTelefono() {
        return telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int  getidentificacion() {
        return identificacion;
    }
    
    public void setidentificacion(int identificacion ) {
        this.identificacion = identificacion;
    }
}





