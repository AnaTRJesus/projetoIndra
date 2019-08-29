package br.com.indra.test.cenarios;

import java.util.ArrayList;

import br.com.indra.filmes.Diretor;
import br.com.indra.filmes.Filme;
import br.com.indra.filmes.page.object.POPesquisaGoogle;
import br.com.indra.filmes.page.object.POResultadoGoogle;
import br.com.indra.utils.Driver;

public class CadastroFilmes extends Driver {
	
	ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
	ArrayList<Filme> listaFilmesConsolidada = new ArrayList<Filme>();

	Diretor diretor = new Diretor();
	Filme filme01 = new Filme();
	Filme filme02 = new Filme();

	POPesquisaGoogle  pesquisaGoogleActions;
	POResultadoGoogle resultadoGoogleActions;
	
	
	public ArrayList<Filme> teste_cadastro_filme() {
		
		diretor.setNome("Niki Caro");
		diretor.setNascimento("1967");
		
		filme01.setAnoLancamento("1998");
		filme01.setDiretor(diretor);
		filme01.setNome("Mulan");
		
		filme02.setAnoLancamento("2005");
		filme02.setDiretor(diretor);
		filme02.setNome("Terra Fria");
		
		listaFilmes.add(filme01);
		listaFilmes.add(filme02);


		
		startDrive("chrome");
		getDrive().get("https://www.google.com");
	    resultadoGoogleActions = new POResultadoGoogle();
		pesquisaGoogleActions = new POPesquisaGoogle();



		for(int a=0; a < listaFilmes.size(); a++) {
			
			if (a<1) {
				
				pesquisaGoogleActions.pesquisarFilme(listaFilmes.get(a).getNome());
				listaFilmes.get(a).setQuantidadeFilmes(resultadoGoogleActions.retornoQuantidadeRegistros());
			}
			
			else {
				
			    resultadoGoogleActions.pesquisarFilme(listaFilmes.get(a).getNome());
				listaFilmes.get(a).setQuantidadeFilmes(resultadoGoogleActions.retornoQuantidadeRegistros());
			}
			
			listaFilmesConsolidada.add(listaFilmes.get(a));
		}	
		
		
		getDrive().close();
	
		
		
		for(int a=0; a < listaFilmesConsolidada.size(); a++) {
			
			System.out.println("Nome do Filme "+listaFilmes.get(a).getNome());
			System.out.println("Quantidade Filmes "+listaFilmes.get(a).getQuantidadeFilmes());
		}	
		
		
		return listaFilmesConsolidada;
		
	}
	
}
