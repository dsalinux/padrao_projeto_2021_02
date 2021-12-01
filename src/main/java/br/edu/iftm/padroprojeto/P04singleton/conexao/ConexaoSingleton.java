package br.edu.iftm.padroprojeto.P04singleton.conexao;

/**
 *
 * @author danilo
 */
public class ConexaoSingleton  {
    
    private static ConexaoSingleton instance;
    
    private ConexaoSingleton(){
        
    }
    
    public static ConexaoSingleton getInstance(){
        if(ConexaoSingleton.instance == null){
            ConexaoSingleton.instance = new ConexaoSingleton();
        }
        return ConexaoSingleton.instance;
    }

    
}
