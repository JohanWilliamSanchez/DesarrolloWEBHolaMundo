/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class BD {
    private ArrayList<Persona>personas;
    public BD(){
        this.personas = new ArrayList<>();
        this.personas.add(new Persona("Valeria", "G"));
        this.personas.add(new Persona("Vaca", "S"));
    }
    public void addPer (Persona persona){
        this.personas.add(persona);
    }
    public ArrayList<Persona> getPersona(){
        return personas;
    }
}