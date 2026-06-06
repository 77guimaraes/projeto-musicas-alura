package br.com.alura.minhasMusicas.principal;

import br.com.alura.minhasMusicas.modelos.Musica;
import br.com.alura.minhasMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        //Objeto minhaMusica
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Time");
        minhaMusica.setCantor("Pink Floyd");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for  (int i = 0; i < 50; i++) {
            minhaMusica.Curte();
        }

        //Objeto meuPodcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setApresentador("Mítico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
    }
}
