package br.com.indra.test.suites;

import org.junit.Test;

import br.com.indra.test.cenarios.APIFilmes;
import br.com.indra.test.cenarios.CadastroFilmes;

public class SuiteTestesFilmes {
	
	CadastroFilmes cadastroFilmes = new CadastroFilmes();
	APIFilmes apiFilmes = new APIFilmes();
	
	
	@Test
	
	public void executarTestesAPIFilmes() {
		apiFilmes.teste_get_filmes();
	}
	
	
	
	@Test
	public void executarTestesCadastroFilmes() {
		cadastroFilmes.teste_cadastro_filme();
	}
	

}
