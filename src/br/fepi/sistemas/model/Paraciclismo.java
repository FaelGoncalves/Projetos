package br.fepi.sistemas.model;

import java.util.Calendar;

public abstract class Paraciclismo extends Evento{

    public Paraciclismo(int id, String nome, Calendar data, String local, double kilometragem, double tempoProva) {
        super(id, nome, data, local, kilometragem, tempoProva);
    }

    public Paraciclismo() {
    }
    
    
}
