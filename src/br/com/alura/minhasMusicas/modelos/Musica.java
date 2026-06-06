package br.com.alura.minhasMusicas.modelos;

public class Musica extends audio{
    private String album;
    private String cantor;
    private String genero;

    //getters = VISUALIZAR
    //setters = ALTERAR

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getTotalReproducoes() {
        if(this.getTotalReproducoes() > 200){
            return 10;
        } else {
            return 7;
        }
    }
}
