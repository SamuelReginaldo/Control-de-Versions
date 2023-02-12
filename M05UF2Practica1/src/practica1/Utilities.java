/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author Samuel Reginaldo
 */
public class Utilities {

    static boolean comprobarOperacio(String operacion) {
        if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                || operacion.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    
}
