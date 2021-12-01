package br.edu.iftm.padroprojeto.P01factorymethod;

public class Caminhao implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Realizando entrega de caixas com Caminhão...");
    }
    
}
