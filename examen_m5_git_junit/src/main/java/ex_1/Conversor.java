/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_1;
import static ex_1.Metodes.*;


/**
 *
 * @author esther
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euros = introduirEuros();
        String moneda = introduirMoneda();
        double canvi = canviarMoneda(moneda, euros);
        System.out.printf("\033[35m %.2f € són %.2f %s \n" , euros, canvi, moneda);

        imprimir(canvi);
    }

}
