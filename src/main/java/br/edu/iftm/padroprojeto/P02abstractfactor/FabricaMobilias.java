package br.edu.iftm.padroprojeto.P02abstractfactor;

import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.sofa.Sofa;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro.MesaCentro;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.cadeiras.Cadeira;

public interface FabricaMobilias {
    
    public Cadeira criarCadeira();
    public Sofa criarSofa();
    public MesaCentro criarMesaCentro();
    
}
