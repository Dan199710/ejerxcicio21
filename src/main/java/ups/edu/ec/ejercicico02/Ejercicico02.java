/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.ejercicico02;

/**
 *
 * @author PC-08
 */
public class Ejercicico02 {

   public static void main(String[] args) {
        System.out.println("Hello World!"); 
        
         var empleado1 = new Empleado();
         empleado1.nombre="Juan";
         empleado1.horasTrabajadas=100;
         empleado1.costoHora=6d;
         empleado1.anioIngreso=2010;
         
         var empleado2= new Empleado();
         empleado2.nombre="Mariana";
         empleado2.horasTrabajadas=200;
         empleado2.costoHora=5d;
         empleado2.anioIngreso=2020;
         
         var empleado3 = new Empleado();
         empleado3.nombre="Carlos";
         empleado3.horasTrabajadas=150;
         empleado3.costoHora=8d;
         empleado3.anioIngreso=2018;
         
         System.out.println("El empleado " + empleado1.nombre + " tiene "
         + empleado1.calcularYear(2022) + " años de antigüedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado1.nombre +  
                            " " + empleado1.calcularIngresos(2022,2010));
         System.out.println("El bono para el empleado es de: " + empleado1.calcularBonoHoras());
         
         System.out.println("El empleado " + empleado2.nombre + " tiene "
         + empleado2.calcularYear(2022) + " años de antigüedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado2.nombre + 
                            " " + empleado2.calcularIngresos(2022,2020));
         System.out.println("El bono para el empleado es de: " + empleado2.calcularBonoHoras());
         
         System.out.println("El empleado " + empleado3.nombre + " tiene "
         + empleado3.calcularYear(2022) + " años de antigüedad en la empresa.");
         System.out.println("El ingreso basico del empleado "+empleado3.nombre +
                            " " + empleado3.calcularIngresos(2022,2018));
         System.out.println("El bono para el empleado es de: " + empleado3.calcularBonoHoras());
    }
}
