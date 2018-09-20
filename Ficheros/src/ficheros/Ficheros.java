/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

/**
 *
 * @author manuel
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import logica.BancoDatos;
import logica.Utilidades;

public class Ficheros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BancoDatos generador = new BancoDatos();
        Utilidades navaja = new Utilidades();
        boolean salir = false;
        do{
            System.out.println("Escoja una opcion: ");
            System.out.println("1. Generar nuevo numero aleatorio.");
            System.out.println("2. Ver numero anterior.");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Digite el numero de numeros que desea:");
                    String str = generador.NumAzar(sc.nextInt());
                    System.out.println("Nuevo numero:" + str);
                    System.out.println("Desea guardarlo: 1. Si o 2. No");
                    
                    switch(sc.nextInt()){
                        case 1:
                            generador.borrar();
                            generador.guardar(str);
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Opcion invalida intente de nuevo.");
                            if(navaja.desicion1() == 1){
                                generador.borrar();
                                generador.guardar(str);
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nuevo numero:");
                    generador.leer();
                    break;
                default:
                    System.out.println("Opcion invalida intente de nuevo.");
                    if(navaja.desicion2() == 1 || navaja.desicion2() == 1){
                        continue;
                    }
                    break;
            }
            System.out.println("Quiere intentarlo de nuevo: 1. Si 2. No");
            int b = sc.nextInt();
            salir = (b == 2)?false:true;
        }while(salir == true);
    }
}