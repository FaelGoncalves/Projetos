package br.fepi.sistemas.model;

public class Bicicleta {
    
    private String modelo;

    public Bicicleta(String modelo) {
        this.modelo = modelo;
    }

    public Bicicleta() {
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "modelo=" + modelo + '}';
    }
    
    
    
}
