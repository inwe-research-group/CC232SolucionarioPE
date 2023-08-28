package edu.aed.cc232solucionariope;

public class Ave implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El ave está nadando en el agua.");
    }
    
}
