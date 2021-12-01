package br.edu.iftm.padroprojeto.P02abstractfactor;

public class TesteFabricaMobilias {

    public static void main(String[] args) {
        FabricaMobilias fabricaModerna = new FabricaMobiliasModerno();
        fabricaModerna.criarCadeira().estilo();
        fabricaModerna.criarMesaCentro().estilo();
        fabricaModerna.criarSofa().estilo();
        
        System.out.println("-------------");
        
        FabricaMobilias fabricaArteDecor = new FabricaMobliasArteDecor();
        fabricaArteDecor.criarCadeira().estilo();
        fabricaArteDecor.criarMesaCentro().estilo();
        fabricaArteDecor.criarSofa().estilo();
    }
    
}
