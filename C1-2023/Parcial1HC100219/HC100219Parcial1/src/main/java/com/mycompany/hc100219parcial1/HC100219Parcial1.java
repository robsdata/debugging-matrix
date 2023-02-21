/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hc100219parcial1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HC100219Parcial1 {

    public static void main(String[] args) {
        Operaciones calculator = new Operaciones();
        Scanner sc = new Scanner(System.in);
        
        float resultado = 0;
        boolean shouldContinue = true;
        
        do {
            System.out.println("Ingresar el primer numero");
            float user_input1 = sc.nextFloat();
            System.out.println("Ingresar el segundo numero");
            float user_input2 = sc.nextFloat();
            
            System.out.println("Ingresar operacion a realizar:\n"
                    + "1-suma\n"
                    + "2-resta\n"
                    + "3-multiplicacion\n"
                    + "4-division\n"
                    + "0-salir\n");
            int user_selection = sc.nextInt();

            
            switch (user_selection) {
                case 1:
                    resultado = calculator.sumar(user_input1, user_input2);
                    System.out.println("El resultado es = "+ resultado);
                    break;
                case 2:
                    resultado = calculator.restar(user_input1, user_input2);
                    System.out.println("El resultado es = "+ resultado);
                    break;
                case 3:
                    resultado = calculator.multiplicar(user_input1, user_input2);
                    System.out.println("El resultado es = "+ resultado);
                    break;    
                case 4:
                    resultado = calculator.dividir(user_input1, user_input2);
                    System.out.println("El resultado es = "+ resultado);
                    break;    
                case 0:
                    shouldContinue = false;
                    break; 
                default:
                    System.out.println("No es valido");
            }

        } while(shouldContinue == true);
    }
}
