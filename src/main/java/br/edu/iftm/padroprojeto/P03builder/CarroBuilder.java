package br.edu.iftm.padroprojeto.P03builder;

public class CarroBuilder implements Builder{

    private Carro carro = new Carro();
    
    @Override
    public void reset() {
        this.carro = new Carro();
    }

    @Override
    public void setAcentos(Integer quantidade) {
        this.carro.setQuantidadeAcentos(quantidade);
    }

    @Override
    public void setMotor(String tipoMotor) {
        this.carro.setTipoMotor(tipoMotor);
    }

    @Override
    public void setComputadorBordo(Boolean possui) {
        this.carro.setComputadorDeBordo(possui);
    }

    @Override
    public void setGPS(Boolean possui) {
        this.carro.setGps(possui);
    }
    
    public Carro resultado(){
        return this.carro;
    }
    
    
}
