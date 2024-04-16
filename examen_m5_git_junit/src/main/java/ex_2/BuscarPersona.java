/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_2;
import java.util.Scanner;
import static ex_2.Metodes.*;

/**
 *
 * @author esther
 */
public class BuscarPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        *  Programa que carrega els noms dels alumnes d'un grup i busca la posició d'un ells.
        *  El grup no té alumnes amb noms repetits
         */
        Scanner entrada = new Scanner(System.in);
        String[] grupA;
        int i = 0, n;
        boolean trobat;

        System.out.print("\n...............INSTITUT LA FERRERIA............ \n ");
        System.out.print("\n...............DAM GRUP 1 A2 .................. \n ");
        System.out.print("\n Introdueix el nombre d'alumnes del grup :  ");

        while (!entrada.hasNextInt()) {
            System.out.print("\n" + "\u001B[35m Introdueix el nombre d'alumnes del grup ( valor numeric ) :  ");
            entrada.nextLine();
           
        }
        n = entrada.nextInt();
        grupA = new String[n];

        introduirLlistaGrup(grupA);

        String nomBuscat = introduirNomBuscat();

        trobat = existeixNom(grupA, nomBuscat);

        if (!trobat) {
            System.out.println("\n \u001B[35m" + nomBuscat + " no existeix en el grup \n\n\n");
        } else {
            System.out.println("\n  \u001B[35m" + nomBuscat + " existeix al grup a la posició " + (posicioArray(grupA, nomBuscat) + 1)+ "\n\n\n");
        }
    }

}

