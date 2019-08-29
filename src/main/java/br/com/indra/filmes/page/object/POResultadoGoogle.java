package br.com.indra.filmes.page.object;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.indra.utils.Driver;

public class POResultadoGoogle{
	
	
	
	public String retornoQuantidadeRegistros() {
		
		String registros = Driver.getDrive().findElement(By.xpath("//*[@id=\"resultStats\"]")).getText();
		
		
		String regex = "[a-zA-Z ]+"; 
		String subst = ""; 
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE); 
		Matcher matcher = pattern.matcher(registros); 
		String result = matcher.replaceAll(subst); 
		
		String regex01 = "\\(.+"; 
		Pattern pattern01 = Pattern.compile(regex01, Pattern.MULTILINE); 
		Matcher matcher01 = pattern01.matcher(result); 
		String resultFinal = matcher01.replaceAll(subst); 
		
	
		System.out.println(resultFinal);
		
		return resultFinal;		
				
	}
	
	public void pesquisarFilme(String pesquisa) {
		
		Driver.getDrive().findElement(By.name("q")).clear();
		Driver.getDrive().findElement(By.name("q")).sendKeys(pesquisa);
		Driver.getDrive().findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
