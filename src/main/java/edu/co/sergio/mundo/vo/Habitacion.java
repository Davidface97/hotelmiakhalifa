/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author Carlos Alberto
 */
public class Habitacion {
    private int Numero;
    private int Precio;
    private int Capacidad;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Persona getResponsable() {
        return Responsable;
    }

    public void setResponsable(Persona Responsable) {
        this.Responsable = Responsable;
    }
    private Persona Responsable;
}
