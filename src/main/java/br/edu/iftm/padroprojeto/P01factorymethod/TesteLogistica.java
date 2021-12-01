package br.edu.iftm.padroprojeto.P01factorymethod;

public class TesteLogistica {

    public static void main(String[] args) {
        Logistica logistica = new LogisticaMaritima();
        logistica.realizarEntrega();
    }
    
}
