package br.edu.iftm.padroprojeto.P01factorymethod;

public class LogisticaRodoviaria extends Logistica {

    @Override
    public Transporte criarTransporte() {
        Transporte transporte = new Caminhao();
        return transporte;
    }
    
}
