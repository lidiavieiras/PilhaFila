/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhafila;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;

public class PilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayQueue<Integer> fila = new ArrayQueue<>(10);

        System.out.println("Início Array Vazio:");
        System.out.println("Fila = " + fila);

        // Add valores 1 - 5
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
    
        while(!lista.isEmpty()){
            pilha.push( lista.get(0) );
            lista.remove(0);
        }

        System.out.println(" | Fila = " + fila);

        // Pilha para fila
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        // Inserindo mais dados na Lista
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        System.out.println(" | Fila = " + fila);


        // Lista para Pilha
        while(!lista.isEmpty()){
            pilha.push(lista.get(0));
            lista.remove(0);
        }

        System.out.println(" | Fila = " + fila);


        // Pilha para fila
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        System.out.println(" | Fila =" + fila);    
    }
    
}
 