package br.fepi.sistemas.model;

import java.util.Calendar;

public abstract class MountainBike extends Evento{
    
    private int qtdObstaculos;

    public MountainBike(int qtdObstaculos, int id, String nome, Calendar data, String local, double kilometragem, double tempoProva) {
        super(id, nome, data, local, kilometragem, tempoProva);
        this.qtdObstaculos = qtdObstaculos;
    }

    public MountainBike(int qtdObstaculos) {
        this.qtdObstaculos = qtdObstaculos;
    }

    public MountainBike() {
    }
    
    public int getQtdObstaculos() {
        return qtdObstaculos;
    }

    public void setQtdObstaculos(int qtdObstaculos) {
        this.qtdObstaculos = qtdObstaculos;
    }
    
    
}
