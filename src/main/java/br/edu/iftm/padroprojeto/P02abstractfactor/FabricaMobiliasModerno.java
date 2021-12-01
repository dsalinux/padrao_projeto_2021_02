package br.edu.iftm.padroprojeto.P02abstractfactor;

import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.cadeiras.Cadeira;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.cadeiras.CadeiraModerna;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro.MesaCentro;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro.MesaCentroModerno;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.sofa.Sofa;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.sofa.SofaModerno;

public class FabricaMobiliasModerno implements FabricaMobilias{

    @Override
    public Cadeira criarCadeira() {
        Cadeira cadeira = new CadeiraModerna();
        return cadeira;
    }

    @Override
    public Sofa criarSofa() {
        Sofa sofa = new SofaModerno();
        return sofa;
    }

    @Override
    public MesaCentro criarMesaCentro() {
        MesaCentro mesaCentro = new MesaCentroModerno();
        return mesaCentro;
    }
    
}
