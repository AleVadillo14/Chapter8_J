/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ1;

import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pregunta pregunta = new Pregunta();
        //pregunta.imprimir();
        System.out.println("Introduce tu respuesta");
        char x = sc.next().charAt(0);
        pregunta.checar(x);
    }
}
