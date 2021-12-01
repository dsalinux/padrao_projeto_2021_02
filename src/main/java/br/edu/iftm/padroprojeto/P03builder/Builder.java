package br.edu.iftm.padroprojeto.P03builder;

/**
 *
 * @author danilo
 */
public interface Builder {
      
    void reset();
    void setAcentos(Integer quantidade);
    void setMotor(String tipoMotor);
    void setComputadorBordo(Boolean possui);
    void setGPS(Boolean possui);
    
}
