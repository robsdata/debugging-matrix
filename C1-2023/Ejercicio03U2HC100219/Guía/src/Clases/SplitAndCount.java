/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author johec
 */
public class SplitAndCount {
    private String nombre;
    private String apellido;
    private String direccion;

    public SplitAndCount(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getNombreLength() {
        return nombre.length();
    }

    public int getApellidoLength() {
        return apellido.length();
    }
    public int getDireccionLength() {
        return direccion.length();
    }
}
