/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guía;

import Clases.Operaciones;
import Clases.ImplicitCasting;
import Clases.ExplicitCasting;
import Clases.arraySum;
import Clases.SplitAndCount;
import Clases.ToUpperCase;

import Matematica.AccesToProtectedMethods;
import Matematica.Estadistica;

import java.util.Scanner;
/**
 *
 * @author johec
 */

public class Ejercicio03U2HC100219 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux = 0;
        Scanner sc = new Scanner(System.in);
        
        while(aux != 1){
            System.out.print("¿Qué ejercicio desea ejecutar?");
            System.out.println("(Ingrese 0 pasa salir)");
            aux = sc.nextInt();
            switch(aux){
                case 0:
                    aux++;
                    sc.close();
                    break;
                case 1:
                    System.out.print("Ingresar número entero para castear implicitamente: ");
                    int number = sc.nextInt();

                    ImplicitCasting implicitCasting = new ImplicitCasting();
                    implicitCasting.doImplicitCasting(number);
                    break;
                case 2:
                    System.out.print("Ingresar número para castear explicitamente: ");
                    number = sc.nextInt();

                    ExplicitCasting ExplicitCasting = new ExplicitCasting();
                    ExplicitCasting.doExplicitCasting(number);
                    break;
                case 3:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese su dirección: ");
                    String direccion = sc.nextLine();

                    SplitAndCount persona = new SplitAndCount(nombre, apellido, direccion);
                    System.out.println("Cantidad de caracteres en el nombre: " + persona.getNombreLength());
                    System.out.println("Cantidad de caracteres en el apellido: " + persona.getApellidoLength());
                    System.out.println("Cantidad de caracteres en la dirección: " + persona.getDireccionLength());
                    break;
                case 4:
                    int[] data = {100, 200, 150, 45, 50, 5, 40, 4, 25};
                    arraySum.calculateSumAndAverage(data);
                    break;
                case 5:
                    String[] datos = {"hola", "buenos", "días"};
                    ToUpperCase.printToUpperCase(datos);
                    break;
                case 6:
                    System.out.print("Ingrese el primer número: ");
                    int numA = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int numB = sc.nextInt();

                    Operaciones op = new Operaciones(numA, numB);
                    System.out.println("La suma es: " + op.suma());
                    System.out.println("La resta es: " + op.resta());
                    System.out.println("La multiplicación es: " + op.multiplicacion());
                    System.out.println("La división es: " + op.division());
                    break;
                case 7:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = sc.nextDouble();

                    AccesToProtectedMethods operacion = new AccesToProtectedMethods();

                    System.out.println("La suma es: " + operacion.suma(num1, num2));
                    System.out.println("La resta es: " + operacion.resta(num1, num2));
                    System.out.println("La multiplicación es: " + operacion.multiplicacion(num1, num2));
                    System.out.println("La división es: " + operacion.division(num1, num2));
                    break;
                case 8:
                    System.out.println("Cuántos números desea ingresar?");
                    int n = sc.nextInt();
                    int[] numbers = new int[n];
                    for (int i = 0; i < n; i++) {
                      System.out.println("Ingrese un número:");
                      numbers[i] = sc.nextInt();
                    }
                    Estadistica est = new Estadistica(numbers);
                    System.out.println("El promedio de los números ingresados es: " + est.promedio());
                    break;
                default:
                    System.out.println("Opción no valida, solo hay opciones del 1 al 8. y 0 para salir");
            }
            
        }
        
    }
    
}
