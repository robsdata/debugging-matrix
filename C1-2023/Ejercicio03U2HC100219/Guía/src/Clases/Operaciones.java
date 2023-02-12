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
public class Operaciones {
  int numA;
  int numB;

  public Operaciones(int numA, int numB) {
    this.numA = numA;
    this.numB = numB;
  }

  public int suma() {
      int resultadoSuma = this.numA + this.numB;
    return resultadoSuma;
  }

  public int resta() {
        int resultadoResta = this.numA - this.numB;
      return resultadoResta;
  }

  public int multiplicacion() {
        int resultadoMultiplicacion = this.numA * this.numB;
    return resultadoMultiplicacion;
  }

  public int division() {
        int resultadoDivision = this.numA / this.numB;
    return resultadoDivision;
  }
  
}
