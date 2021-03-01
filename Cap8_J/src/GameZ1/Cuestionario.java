/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ1;

import java.util.ArrayList;

/**
 *
 * @author ALEW
 */
public class Cuestionario {
    private ArrayList<Pregunta> preguntas;
    private Integer puntaje;

    public Cuestionario(){
        preguntas = new ArrayList<>(4);
        this.puntaje = 0;
    }

}
