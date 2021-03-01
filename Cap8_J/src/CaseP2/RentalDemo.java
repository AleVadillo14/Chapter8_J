/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseP2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rental> renta = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Número de contrato para " +i + 1 + " renta");
            String noContrato = sc.nextLine();

            System.out.println("Total de minutos");
            int minutos = sc.nextInt();

            System.out.println("Número de telefono");
            String telefoo = sc.nextLine();

            System.out.println("Número de equipo: [1]Moto acuatica [2]Ponton [3]Bote de remos");
            System.out.println("[4]Canoa [5]Kayac [6]Silla de playa [7]Paraguas [8]Otro");
            int equipo = sc.nextInt();

            renta.add(new Rental(noContrato,minutos,telefoo,equipo));
        }

        for (int i = 0; i < renta.size(); i++) {
            System.out.println(renta.get(i).getNoContrato());
            System.out.println(renta.get(i).getNoMinutos());
            System.out.println(renta.get(i).getNoTelefono());
            System.out.println(renta.get(i).getTipoDeEquipo());
        }
    }
}
