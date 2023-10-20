 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        System.out.println("ingrese los nombres:");
        Scanner it = new Scanner(System.in);
        String weon = it.nextLine();
        String[] alumnos=weon.split(",");

           

        for (String f : alumnos) {
            String[] alumno = f.split(" ");
            String id = alumno[0];
            String primernom = alumno[3];
            String primerapellido = alumno[1];

            System.out.println("ID: "+ id +" - "+primernom+" "+primerapellido);
        }
    }
}
