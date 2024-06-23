package Funcoes_do_celular.Celular;

import Funcoes_do_celular.AparelhoTelefonico;
import Funcoes_do_celular.NavegadorInternet;
import Funcoes_do_celular.ReprodutorMusical;

public  class Iphone  implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
   
    public void ligar() {
        System.out.println("Iphone ligado");
    }

    @Override
    public void atender() {
       System.out.println("Atender Ligação");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado!");
    }

    @Override
    public void selecionarMusica(String musica) {
        musica = " when the levee breaks";
        System.out.println("Musica selecionada: "+musica);
    }

    @Override
    public void exibirPaginas(String url) {
       url = "https://www.youtube.com";
       System.out.println("Pagina exibida: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n");
        iphone.exibirPaginas("google");
        iphone.selecionarMusica("musica");
        iphone.adicionarNovaAba();
    }
       
}


        

   