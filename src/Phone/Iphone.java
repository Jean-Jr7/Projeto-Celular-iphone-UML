package Phone;

import Phone.Apps.Funcionalidades.BrowserImpl;
import Phone.Apps.Funcionalidades.IpodImpl;
import Phone.Apps.Funcionalidades.PhoneImpl;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("testando as funcionalidades do IPhone do Desafio POO e UML");
        System.out.println("------------------------------------------------------------------");
        System.out.println("TESTANDO NAVEGADOR");
        BrowserImpl navegador = new BrowserImpl();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        System.out.println("------------------------------------------------------------------");
        System.out.println("TESTANDO MP3 TOCADOR DE MUSICA");
        IpodImpl mp3 = new IpodImpl();
        mp3.selecionarMusica(3);
        mp3.tocarMusica();
        mp3.pausaMusica();


        System.out.println("------------------------------------------------------------------");
        System.out.println("TESTANDO TELEFONE");
        PhoneImpl telefone = new PhoneImpl();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
    }

}
