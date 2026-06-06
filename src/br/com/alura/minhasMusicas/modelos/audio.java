package br.com.alura.minhasMusicas.modelos;

public class audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void Curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
