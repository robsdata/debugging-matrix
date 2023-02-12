/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

/**
 *
 * @author johec
 */
public class Estadistica {
  private int[] datos;

  public Estadistica(int[] datos) {
    this.datos = datos;
  }

  public double promedio() {
    int suma = 0;
    for (int i = 0; i < datos.length; i++) {
      suma += datos[i];
    }
    return (double) suma / datos.length;
  }
}
