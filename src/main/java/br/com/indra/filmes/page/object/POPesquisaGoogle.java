package br.com.indra.filmes.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.indra.utils.Driver;

public class POPesquisaGoogle {
	
	public void pesquisarFilme(String pesquisa) {
		
		Driver.getDrive().findElement(By.name("q")).clear();
		Driver.getDrive().findElement(By.name("q")).sendKeys(pesquisa);
		Driver.getDrive().findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
