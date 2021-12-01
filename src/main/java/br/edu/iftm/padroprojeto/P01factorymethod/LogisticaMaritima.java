package br.edu.iftm.padroprojeto.P01factorymethod;

public class LogisticaMaritima extends Logistica {

    @Override
    public Transporte criarTransporte() {
        Transporte transporte = new Navio();
        return transporte;
    }
    
}
