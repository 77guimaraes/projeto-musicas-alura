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

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 0;
        }
    }
}
