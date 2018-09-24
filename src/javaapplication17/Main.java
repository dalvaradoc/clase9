/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;
import java.awt.*;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e = new Equipo("U");
        Jugador j1 = new Jugador("V");
        boolean resultado = e.addJugador(j1);
        if (resultado){
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        
        ArrayList<Jugador> lista = e.getJugadores();
        for (Jugador j : lista){
            System.out.println(j.getNombre());
        }
        
        //es lo mismo que escribir
        
        for (int i = 0; i < lista.size(); i++){
            Jugador j = lista.get(i);
            System.out.println(j.getNombre());
        }
        
        HashMap<String, Jugador> jugadores2 = new HashMap<>();
        jugadores2.put(j1.getNombre(), j1);
        
        System.out.println(jugadores2.get(j1.getNombre()).getNombre());
    }
}
