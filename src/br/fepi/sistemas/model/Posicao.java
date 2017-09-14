package br.fepi.sistemas.model;


public class Posicao {
    
    private int numero;

    public Posicao(int numero) {
        this.numero = numero;
    }
    
    public Posicao() {
        
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Posicao{" + "numero=" + numero + '}';
    }

    
    
}
