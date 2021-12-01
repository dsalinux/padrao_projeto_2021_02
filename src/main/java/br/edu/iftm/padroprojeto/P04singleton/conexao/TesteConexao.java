package br.edu.iftm.padroprojeto.P04singleton.conexao;

import java.util.Calendar;
import java.util.Objects;

public class TesteConexao {

    public static void main(String[] args) {
        ConexaoSingleton conexao1 = ConexaoSingleton.getInstance();
        ConexaoSingleton conexao2 = ConexaoSingleton.getInstance();
        ConexaoSingleton conexao3 = ConexaoSingleton.getInstance();
        System.out.println(conexao1.equals(conexao2));
        System.out.println(conexao2.equals(conexao3));
        System.out.println(conexao3.equals(conexao1));
        
        
        Calendar calendar = Calendar.getInstance();
    }
    
}
