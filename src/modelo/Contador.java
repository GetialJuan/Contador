/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Sebastian Getial Getial <getial.juan@correounivalle.edu.co>
 * Clase que simula las acciones de un contador
 */
public class Contador {
    private int cuenta;
    
    public Contador()
    {
        cuenta = 0;
    }
    
    public void aumentarContador()
    {
        cuenta += 1;
    }
    
    public void disminuirContador()
    {
        cuenta -= 1;
    }
    
    public void resetearContador()
    {
        cuenta = 0;
    }
    
    public int getCuenta()
    {
        return cuenta;
    }
}
