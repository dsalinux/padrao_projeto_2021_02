package br.edu.iftm.padroprojeto.P02abstractfactor;

import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.cadeiras.Cadeira;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.cadeiras.CadeiraArteDecor;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro.MesaCentro;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro.MesaCentroArteDecor;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.sofa.Sofa;
import br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.sofa.SofaArteDecor;

public class FabricaMobliasArteDecor implements FabricaMobilias {
     @Override
    public Cadeira criarCadeira() {
        Cadeira cadeira = new CadeiraArteDecor();
        return cadeira;
    }

    @Override
    public Sofa criarSofa() {
        Sofa sofa = new SofaArteDecor();
        return sofa;
    }

    @Override
    public MesaCentro criarMesaCentro() {
        MesaCentro mesaCentro = new MesaCentroArteDecor();
        return mesaCentro;
    }
}
