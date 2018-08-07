package br.unicentro.acaddecomp;

public class Real implements Proxy{

	@Override
	public void Acessa(String pagina) {
		System.out.println("Pagina " + pagina + " acessada pelo Endereço Real");
	}

}
