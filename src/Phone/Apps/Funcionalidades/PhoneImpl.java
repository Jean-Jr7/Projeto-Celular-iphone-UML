package Phone.Apps.Funcionalidades;

import Phone.Apps.Phone;

public class PhoneImpl implements Phone {
    @Override
    public void ligar() {
        VerificarSinal();
        System.out.println("Efetuando Chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de voz");
    }
    private void VerificarSinal(){
        System.out.println("Verificando sinal do chip");
    }
}


