package br.com.alura.minhasMusicas.modelos;

public class audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    //Permite visualizar titulo
    public String getTitulo() {
        return titulo;
    }

    //Permite alterar titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodo para Curtir
    public void Curte(){
        this.totalCurtidas++;
    }

    //Metodo para reproduzir
    public void reproduz(){
        this.totalReproducoes++;
    //quando chamar esse métodos, adiciona mais um no total de repoduções
    }
}
