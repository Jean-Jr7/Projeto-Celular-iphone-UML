package Phone.Apps.Funcionalidades;

import Phone.Apps.Browser;

public  class BrowserImpl implements Browser {

    @Override
    public void exibirPagina() {
        VerificarSinal();
        System.out.println("Exbindo pagina");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova aba");

    }

    @Override
    public void atualizarPagina() {
        VerificarSinal();
        System.out.println("Atualizando pagina");
    }

    private void VerificarSinal() {
        System.out.println("Verificando sinal de internet");
    }
}
