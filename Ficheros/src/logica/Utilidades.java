/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Utilidades {
    
    public Scanner sc = new Scanner(System.in);
    
    public int desicion1(){
        
        System.out.println("Desea guardarlo: 1. Si o 2. No");
        int a = 0;
        boolean desicion = false;
        switch(sc.nextInt()){
            case 1:
                a=1;
                break;
            case 2:
                a=2;
                break;
            default:
                do{
                    System.out.println("Opcion invalida intente de nuevo.");
                    System.out.println("Desea guardarlo: 1. Si o 2. No");
                    a = sc.nextInt();
                    desicion = (a == 2) ?true:desicion;
                    desicion = (a == 1) ?true:desicion;
                }while(desicion == false);
                break;
        }        
        return a;
    } 
    public int desicion2(){
        
        System.out.println("Escoja una opcion: ");
        System.out.println("1. Generar nuevo numero aleatorio.");
        System.out.println("2. Ver numero anterior.");
        int a = 0;
        boolean desicion = false;
        switch(sc.nextInt()){
            case 1:
                a=1;
                break;
            case 2:
                a=2;
                break;
            default:
                do{
                    System.out.println("Opcion invalida intente de nuevo.");
                    System.out.println("Escoja una opcion: ");
                    System.out.println("1. Generar nuevo numero aleatorio.");
                    System.out.println("2. Ver numero anterior.");
                    a = sc.nextInt();
                    desicion = (a == 2) ?true:desicion;
                    desicion = (a == 1) ?true:desicion;
                }while(desicion == false);
                break;
        }        
        return a;
    } 
}
