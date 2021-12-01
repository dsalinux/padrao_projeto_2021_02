package br.edu.iftm.padroprojeto.P04singleton.tela;

/**
 *
 * @author danilo
 */
public class GerenciadorJanelas {

    private static HelloFrm helloFrm;
    
    public static HelloFrm instanciaHelloFrm(){
        if(helloFrm == null) {
            helloFrm = new HelloFrm();
        }
        return helloFrm;
    }
    
}
