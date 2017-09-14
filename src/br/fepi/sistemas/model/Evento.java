package br.fepi.sistemas.model;

import java.util.Calendar;

public abstract class Evento {
    
    private int id;
    private String nome;
    private Calendar data;
    private String local;
    private double kilometragem;
    private double tempoProva;

    public Evento(int id, String nome, Calendar data, String local, double kilometragem, double tempoProva) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.kilometragem = kilometragem;
        this.tempoProva = tempoProva;
    }

    public Evento() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public double getTempoProva() {
        return tempoProva;
    }

    public void setTempoProva(double tempoProva) {
        this.tempoProva = tempoProva;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", local=" + local + ", kilometragem=" + kilometragem + ", tempoProva=" + tempoProva + '}';
    }
    
}
