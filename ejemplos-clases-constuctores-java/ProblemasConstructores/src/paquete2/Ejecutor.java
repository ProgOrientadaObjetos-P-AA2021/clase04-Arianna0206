/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nom;
        String ciu;
        int nDoc;
        int nEn ;
        
        System.out.println("Ingrese el nombre del Hospital");
        nom = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que se encuentra el "
                + "hospital");
        ciu = entrada.nextLine();
        System.out.println("Ingrese cuantos doctores hay en el hospital");
        nDoc = entrada.nextInt();
        System.out.println("Ingrese cuantos enfermeros hay en el hospital");
        nEn = entrada.nextInt();
        
        
        
        Hospital h1 = new Hospital(nom,ciu,nDoc,nEn);
        
        System.out.printf("\nNombre: %s\nCiudad: %s\n"
                + "Numero Doctores: %d\nNumero Enfermeros: %d\n",
                h1.obtenerNombre(),
                h1.obtenerCiudad(),
                h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
        
        
    }
}
