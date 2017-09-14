package br.fepi.sistemas.model;

import java.util.Calendar;

public abstract class Estrada extends Evento{
    
    private boolean acidentado;

    public Estrada(boolean acidentado, int id, String nome, Calendar data, String local, double kilometragem, double tempoProva) {
        super(id, nome, data, local, kilometragem, tempoProva);
        this.acidentado = acidentado;
    }

    public Estrada(boolean acidentado) {
        this.acidentado = acidentado;
    }

    public Estrada() {
    }
    
    public boolean isAcidentado() {
        return acidentado;
    }

    public void setAcidentado(boolean acidentado) {
        this.acidentado = acidentado;
    }
    
    
}
