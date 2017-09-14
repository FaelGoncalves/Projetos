package br.fepi.sistemas.model;


public class Ciclista {
    
    private int id;
    private String nome;
    private String pais;
    private char sexo;

    public Ciclista(int id, String nome, String pais, char sexo) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.sexo = sexo;
    }

    public Ciclista() {
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ciclista{" + "id=" + id + ", nome=" + nome + ", pais=" + pais + ", sexo=" + sexo + '}';
    }
    
       
}
