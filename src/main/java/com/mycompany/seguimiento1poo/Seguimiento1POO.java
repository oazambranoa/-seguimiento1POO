/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seguimiento1poo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Seguimiento1POO {

    public static void main(String[] args) {
        
        System.out.println("::::::Primer ejercicio::::::::");
     
        Scanner edad = new Scanner(System.in);
        System.out.println("Ingrese la edad de juan");
        double edJuan = edad.nextDouble();
        
        double edAlber = 2 * edJuan / 3;
        double edAna = 4 * edJuan / 3;
        double edMom = edJuan + edAlber + edAna;
        
        System.out.println("la edad de Juan es: " + edJuan);
        System.out.println("La edad de Alberto es: " + edAlber);
        System.out.println("La edad de Ana es: " + edAna);
        System.out.println("La edad de la mama es: " + edMom);
        
        System.out.println(":::::Segundo ejercicio:::::");
     
        double suma = 0;
        double x = 20;
        suma = suma + x;
        double y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + x/y;
        System.out.println("El valor de la suma es: " + suma);
        
        
        System.out.println("::::::Tercer ejercicio:::::::");
         
        double jobHours = 48;
        double  priceHour = 5000;
        double reteFuente = 0.125;
        
        double subtotalSal = jobHours * priceHour;
        double totalRete = subtotalSal * reteFuente;
        double totalSal = subtotalSal - totalRete;
        
        System.out.println("El salario bruto es $" + subtotalSal);
        System.out.println("la retencion a la fuente es $" + totalRete);
        System.out.println("El salario neto del trabajador es $" + totalSal);
        
        System.out.println("::::::::Cuarto ejercicio:::::::::::");
        
        Scanner number = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        double inNumber = number.nextDouble();
        
        double cuadrado = Math.pow(inNumber, 2);
        double cubo = Math.pow(inNumber, 3);
           
        System.out.println(
                "El cuadrado de " + inNumber + " es: " + cuadrado);
        System.out.println(
                 "El cubo de " + inNumber + " es: " + cubo);
        
        System.out.println(":::::::::Quinto Ejercicio::::::::::::");

        Scanner radious = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = radious.nextDouble();
        
        double pi = 3.1416;
        double area = pi * Math.pow(radio, 2);
        double lonCir = 2 * pi * radio;
        
        System.out.println("El area del circulo es: " + area + " y la longitud de la circunferencia es: " + lonCir);
        
        
    }
}
