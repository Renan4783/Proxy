package br.unicentro.acaddecomp;

import java.util.*;

public class Intermediario implements Proxy {

	private List<String> paginas = new LinkedList<>();
	private Real sujeitoReal;

	@Override
	public void Acessa(String pagina) {
		if (!paginas.contains(pagina) && paginas.size()<10){
			sujeitoReal = new Real();
			sujeitoReal.Acessa(pagina);
			paginas.add(pagina);
		} else {
			System.out.println("Pagina " + pagina + " acessada pelo Cache");
		}
	}
	
	
	
}
