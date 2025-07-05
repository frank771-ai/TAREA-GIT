/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frank
 */

public class VENDEDOR {
    private String nombre;
    private int codigo_vendedor;
    private int identificacion;  
    private double ventas_totales;

 /*constructor de la clase vendedor 
 @param nombre nombre del vendedor 
 @param codigo_vendedor es el codigo del vendedor 
 @param identificacion es la identificacion del vendedor 
 */
    public VENDEDOR (String nombre, int codigo_vendedor,int identificacion,double ventas_totales) {
       this.nombre= nombre;
       this.codigo_vendedor=codigo_vendedor;
       this.identificacion = identificacion;
       this.ventas_totales = 0.0;
  
    }
    /*
    Creamos el metodo para realizar venta
    */
    
    public void realizar_venta(double monto){
        if (monto>0) {
          this.ventas_totales += monto;
          System.out.println(" venta realizada por "+ monto);
        } else {
            System.out.println("no se pudo realizar la venta");
        }
    }

 /*
 Creamos el metodo mostrar datos del vendedor 
 */

 public void mostrar_informacion_vendedor() {
    System.out.println("el nombre de el vendedor es" + nombre);
    System.out.println("el codigo del vendedor es" + codigo_vendedor);
    System.out.println("la identificacion del vendedor es" + identificacion);
     System.out.println("la identificacion del vendedor es" + ventas_totales);
 }

 public String getnombre() {
    return nombre;
 }

 public void setnombtre(String nombre){
    this.nombre = nombre;
 }
 public int getcodigo_vendedor (){
    return codigo_vendedor;
 }

 public void setcodigo_vendedor (int codigo_vendedor){
    this.codigo_vendedor = codigo_vendedor;
 }
 public int getidentificacion (){
    return identificacion;
 }
 public void  setidentificacion(int identificacion){
    this.identificacion = identificacion;
 }
}


    

