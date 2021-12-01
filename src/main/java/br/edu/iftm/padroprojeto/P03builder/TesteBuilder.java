package br.edu.iftm.padroprojeto.P03builder;

public class TesteBuilder {
    
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroBuilder builder = new CarroBuilder();
        builder = diretor.criarSUV(builder);
        
        Carro carroSUV = builder.resultado();
        
        builder.reset();
        
        builder = diretor.criarOffRoad(builder);
        
        Carro carroOffRoad = builder.resultado();
        
        System.out.println("\n");
        carroSUV.visualizar();
        System.out.println("-------------");
        carroOffRoad.visualizar();
        System.out.println("\n");
    }
    
}
