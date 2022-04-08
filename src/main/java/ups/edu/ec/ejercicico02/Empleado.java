/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicico02;

/**
 *
 * @author PC-08
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    
    public int calcularYear (int currentYear){
        var retorno=10000;
                retorno=currentYear-this.anioIngreso;
        return retorno;
    }
    
    public double calcularIngresos (int currentYear,int anioIngreso){
        var retorno=1000000d;
        retorno=((0.02)*(currentYear-anioIngreso)*(costoHora*horasTrabajadas)+(costoHora*horasTrabajadas));
        return retorno;
    }
    
    public double calcularBonoHoras (){
        var retorno =100000d;
        retorno=(horasTrabajadas-100)*(2*costoHora);
        return retorno;
    }
}
