package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String[] args) {
		Proxy sujeito = new Intermediario();
		sujeito.Acessa("www.google.com");
		sujeito.Acessa("www.google.com");
	}
}
