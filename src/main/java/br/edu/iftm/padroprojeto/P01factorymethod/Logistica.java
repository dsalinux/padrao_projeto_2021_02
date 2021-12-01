package br.edu.iftm.padroprojeto.P01factorymethod;

public abstract class Logistica {
    
    public void realizarEntrega(){
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
    
    public abstract Transporte criarTransporte();
    
}
