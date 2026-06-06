package br.com.alura.minhasMusicas.modelos;

public class audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    //Permite visualizar titulo
    public String getTitulo() {
        return titulo;
    }

    //Permite alterar titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //Permite visualizar Total de Reproduções
    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    //Permite visualizar Total de Curtidas
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    //Permite visualizar Classificacao
    public int getClassificacao() {
        return classificacao;
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
