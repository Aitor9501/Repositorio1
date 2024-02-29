/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otro;

import auxiliar.*;

/**
 *
 * @author Diurno
 */
public class Saludador {

    private int contador = 0;
    private String idioma;

    public Saludador() {
        contador = 0;
        idioma = "ES";
    }
    /**
     * Constructor que establece el contador a 0 y determina un idioma
     *
     */
    public Saludador (String lenguaje){
        this.contador = 0;
        this.idioma = lenguaje;
    }
    public Saludador(int contador, String idioma) {
        this.contador = 0;
        this.idioma = idioma;
    }
    /**
     * Método de modificación del idioma
     * @param idioma Cadena con el idioma del saludador
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    /**
     * 
     * @return 
     */
    public int getContador(){
        return contador;
    }
    /**
     * Método que saluda mostrando e número de veces que ha salidado
     * @return Una cadena con el saludo
     */
    public String saludar() {
        contador++;
        if (idioma.equals("ES")) {
            return "Hola (" + contador + ")";
        }
        return "Hello (" + contador + ")";
    }
}