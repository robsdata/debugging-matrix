/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hc100219parcial1;

/**
 *
 * @author User
 */
public class Operaciones {
    
    public float sumar(float num1, float num2) {
        return num1 + num2;
  }
  
    public float restar(float num1, float num2) {
        return num1 - num2;
  }
  
    public float multiplicar(float num1, float num2) {
        return num1 * num2;
  }
  
    public float dividir(float num1, float num2) {
        if(num2 == 0) {
          System.out.println("No se puede dividir por cero.");
        } 
        return num1 / num2;
    }
}
