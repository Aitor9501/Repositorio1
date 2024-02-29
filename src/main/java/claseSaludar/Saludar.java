/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package claseSaludar;

import auxiliar.Saludador;

/**
 *
 * @author Diurno
 */
public class Saludar {

    public static void main(String[] args) {
        Saludador s1 = new Saludador();
        Saludador s2 = new Saludador("EN");
        otro.Saludador s3 = new otro.Saludador();
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s3.saludar());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
    }
}


