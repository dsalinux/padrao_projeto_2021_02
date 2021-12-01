package br.edu.iftm.padroprojeto.P01factorymethod;

public class Navio implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Realizando entrega de containers com Navio...");
    }
    
}
