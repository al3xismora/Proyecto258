package com.mycompany.proyecto258;

public class Factura {

    //Este metodo sigue calculando el precio total
    public static double calcularPrecioTotal(double precio, int cantidad) {
        double total = precio * cantidad;

        //Ahora el calculo lo hace otro metodo y aqui se usa ese metodo para validar descuentos
        validarDescuento(total, cantidad);
        return total;
    }

    //Este metodo es exclusivo para vcalidar descuentos y al estar separado puede ser usado en otros metodos
    public static void validarDescuento(double total, int cantidad) {
        if (cantidad > 10) {
            total = total - (total * 0.1);
        }
    }

    //Se ha renombrado este metodo a datosFactura ya que refleja mejor la informacion que nos da
    public static void datosFactura(String nombre, String apellido, String direccion, double precio, int cantidad) {

        /*Se ha agregado un objeto de tipo cliente que va asociado a las facturas 
          y aqui se usa su metodo para extraer la informacion*/
        Cliente.informacionCliente(nombre, apellido, direccion);
        
        //Ahora se muestra el resto de informaciond de la facura
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Total a pagar: " + calcularPrecioTotal(precio, cantidad));
    }

    
    //Aqui ponemos a prueba nuestros metodos con este cliente
    public static void main(String[] args) {
        datosFactura("Juan", "Mendoza", "Calle Mayor 30", 15.0, 12);

    }

}
