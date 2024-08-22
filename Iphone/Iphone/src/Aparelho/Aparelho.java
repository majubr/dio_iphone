package Aparelho;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Aparelho {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AparelhoTelefonico telefone = new AparelhoTelefonico ();
		
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();

		NavegadorInternet url = new NavegadorInternet();
		
		url.adicionarNovaAba();
		url.atualizarPagina();
		url.exibirPagina();
		
		ReprodutorMusical musica = new ReprodutorMusical();
		
		musica.selecionarMusica();
		musica.tocar();
		musica.pausar();
	}


}
