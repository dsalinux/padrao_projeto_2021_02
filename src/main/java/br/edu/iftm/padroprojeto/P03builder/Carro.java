package br.edu.iftm.padroprojeto.P03builder;

public class Carro {
    
    private Integer quantidadeAcentos;
    private String tipoMotor;
    private Boolean computadorDeBordo;
    private Boolean gps;

    public Integer getQuantidadeAcentos() {
        return quantidadeAcentos;
    }

    public void setQuantidadeAcentos(Integer quantidadeAcentos) {
        this.quantidadeAcentos = quantidadeAcentos;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Boolean getComputadorDeBordo() {
        return computadorDeBordo;
    }

    public void setComputadorDeBordo(Boolean computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }
    
    public void visualizar(){
        System.out.println("Acentos: "+this.quantidadeAcentos);
        System.out.println("Motor: "+this.tipoMotor);
        System.out.println("Coputador: "+this.computadorDeBordo);
        System.out.println("GPS: "+this.gps);
    }
    
    
}
