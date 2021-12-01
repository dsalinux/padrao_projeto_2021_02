package br.edu.iftm.padroprojeto.P03builder;

/**
 *
 * @author danilo
 */
public class Diretor {
    
    public CarroBuilder criarSUV(CarroBuilder builder){
        builder.setAcentos(7);
        builder.setMotor("Motor 2.0");
        builder.setComputadorBordo(true);
        builder.setGPS(true);
        return builder;
    }
    public CarroBuilder criarOffRoad(CarroBuilder builder){
        builder.setAcentos(4);
        builder.setMotor("Motor 3.2");
        builder.setComputadorBordo(false);
        builder.setGPS(false);
        return builder;
    }
    
}
