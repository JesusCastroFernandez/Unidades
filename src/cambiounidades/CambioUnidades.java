/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiounidades;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class CambioUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        double metros;

        // Variables de salida
        double decimetros, centimetros, milimetros;
        double pulgadas, pies, yardas;

        // Variables auxiliares
        // Clase Scanner para peticióde datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("TRANSFORMACIÓN DE UNIDADES");
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.print("Introduzca la longitud en metros que desea transformar: ");
        metros = teclado.nextDouble();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Sistema Internacional
        decimetros = metros * 10;
        centimetros = metros * 100;
        milimetros = metros * 1000;

        // Sistema anglosajón
        pulgadas = metros * 100 / 2.54;
        pies = pulgadas / 12;
        yardas = pies / 3;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println();
        System.out.println("SISTEMA INTERNACIONAL");
        System.out.println("---------------------");
        System.out.println("La medida " + metros + " en metros son:");
        System.out.println(decimetros + " decímetros");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");

        System.out.println();
        System.out.println("SISTEMA ANGLOSAJÓN");
        System.out.println("------------------");
        System.out.println("La medida " + metros + " en metros son:");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(pies + " pies");
        System.out.println(yardas + " yardas");

        System.out.println();
        System.out.println("Fin del programa. Bye!");
    }
    
}
