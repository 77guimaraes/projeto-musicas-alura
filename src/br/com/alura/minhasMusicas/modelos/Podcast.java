package br.com.alura.minhasMusicas.modelos;

public class Podcast extends audio{
    private String titulo;
    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
}
