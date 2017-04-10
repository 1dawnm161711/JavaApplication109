/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication109;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public class JavaApplication109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTES
        final int MIN = 10;
        final int MAX = 20;
        final char LETRA_MIN = 'a';
        final char LETRA_MAX = 'z';

        // Locale
        Locale lcl = new Locale("EN", "uk");

        // Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        scn.useLocale(lcl);

        // Random
        Random rnd = new Random();
        
        // Gregorian Calendar
        GregorianCalendar gc = new GregorianCalendar();

        // Hora
        int h = gc.get(Calendar.HOUR_OF_DAY);
        int m = gc.get(Calendar.MINUTE);
        int s = gc.get(Calendar.SECOND);

        // Fecha
        int d = gc.get(Calendar.DAY_OF_MONTH);
        int x = gc.get(Calendar.MONTH) + 1;
        int a = gc.get(Calendar.YEAR);

        // Metodos Scanner
        System.out.print("Entero ....: ");
        int n = scn.nextInt();
        System.out.print("Real ......: ");
        double f = scn.nextDouble();
        System.out.print("Boolean ...: ");
        boolean b = scn.nextBoolean();
        scn.nextLine();
        System.out.print("Caracter ..: ");
        char c = scn.nextLine().charAt(0);

        // Metodos random
        int numero = rnd.nextInt(MAX - MIN + 1) + MIN;
        double tasa = rnd.nextDouble() * (MAX - MIN) + MIN;
        boolean estadoOK = rnd.nextBoolean();
        char letra = (char) (rnd.nextInt(LETRA_MAX - LETRA_MIN + 1) + LETRA_MIN);

        // Salidas
        System.out.printf("Entero ......: %d\n", n);
        System.out.printf(lcl, "Real ........: %.2f\n", f);
        System.out.printf("Logico ......: %b\n", b);
        System.out.printf("Caracter ....: %c\n", c);
        
        System.out.printf("Hora ........: %02d:%02d:%02d\n", h, m, s);
        System.out.printf("Fecha .......: %02d/%02d/%d\n", d, x, a);  
    }

}
