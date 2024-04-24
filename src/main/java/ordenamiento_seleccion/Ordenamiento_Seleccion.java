/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ordenamiento_seleccion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anayc
 */
public class Ordenamiento_Seleccion {
    
    private static ArrayList<Atleta> atletas = new ArrayList();
    static Scanner lec= new Scanner(System.in);
    
    public static void main(String[] args) {
        int option=0;
        do {
            System.out.println("1. registrar atletas");
            System.out.println("2. Ordenar por seleccion");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opción");
            option=lec.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Escribir el numero de tiempos a Ingresar :");
        int input=lec.nextInt();
        for(int i=0; i< input;i++){
            System.out.println("Digite el Tiempo del Atleta numero: "+(i+1));
            double tiempoAtleta=lec.nextDouble();
            registrarTiempos(tiempoAtleta);
        }
        System.out.println("Listado de los Tiempos");
        mostrarTiempos();
                    break;
                case 2:
                    ordenarPorSeleccion();
                    mostrarTiempos();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción No Valida");
                    break;
                
            }
            
        } while (option!=3);
        
    }
    
            
                
            
    public static void registrarTiempos(double tiempo){
        Atleta nuevoTiempo = new Atleta(tiempo);
        atletas.add(nuevoTiempo);
    
    }
    
    public static void mostrarTiempos(){
        for(Atleta a: atletas){
            System.out.println(a.getTiempo());
        }
    
    }
        public static void ordenarPorSeleccion() { 
        for (int i = 0; i < atletas.size() - 1; i++) {
            Atleta menor = atletas.get(i);
            int posMenor = i;
            for (int j = i + 1; j < atletas.size(); j++) {
                Atleta actual = atletas.get(j);
                if (actual.getTiempo() < menor.getTiempo()) {
                    menor = actual;
                    posMenor = j;
                }
            }
            Atleta temp = atletas.get(i);
            atletas.set(i, menor);
            atletas.set(posMenor, temp);
        }
    
    }
    
}

    

