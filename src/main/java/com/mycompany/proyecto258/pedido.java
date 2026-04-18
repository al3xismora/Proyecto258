package com.mycompany.proyecto258;

import java.util.Date;

public class pedido {

    private int numeroPedido;
    private Date fecha;
    private int cantidad;

    public pedido(int cantidad, Date fecha, int numeroPedido) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}