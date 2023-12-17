package Phone.Apps.Funcionalidades;

import Phone.Apps.Ipod;

public class IpodImpl implements Ipod {
    @Override
    public void selecionarMusica(int musica) {

        switch (musica) {
            case 1:
                System.out.println("musica 1 selecionada");

                break;
            case 2:
                System.out.println("música 2 selecionada");

                break;
            case 3:
                System.out.println("musica 3 selecionada");

                break;
            case 4:
                System.out.println("música 4 selecionada");

                break;
            case 5:
                System.out.println("música 5 selecionada");

                break;
            default:
                System.out.println("Número inválido. Escolha um número de 1 a 5.");
        }
    }
    @Override
    public void tocarMusica() {
        System.out.println("tocando a musica");
    }

    @Override
    public void pausaMusica() {
        System.out.println("Pausando musica");
    }
}
