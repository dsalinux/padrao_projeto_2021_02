package br.edu.iftm.padroprojeto.P02abstractfactor.mobilias.mesacentro;

public class MesaCentroArteDecor implements MesaCentro {
    @Override
    public void estilo() {
        System.out.println("Estilo MesaCentro Arte Decor");
    }
}
