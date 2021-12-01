package br.edu.iftm.padroprojeto.P04singleton.tela;

/**
 *
 * @author danilo
 */
public class TesteJanela {

    public static void main(String[] args) {
        JanelaFrm janela1 = JanelaFrm.getInstance();
        JanelaFrm janela2 = JanelaFrm.getInstance();
        JanelaFrm janela3 = JanelaFrm.getInstance();
        
        janela1.setVisible(true);
        janela2.setVisible(true);
        janela3.setVisible(true);
        
        GerenciadorJanelas.instanciaHelloFrm().setVisible(true);
        GerenciadorJanelas.instanciaHelloFrm().setVisible(true);
        GerenciadorJanelas.instanciaHelloFrm().setVisible(true);
    }
    
}
