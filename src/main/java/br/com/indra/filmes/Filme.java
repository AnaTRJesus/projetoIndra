package br.com.indra.filmes;

public class Filme {
	
	private String nome;
	private String anoLancamento;
	private String quantidadeFilmes;
	private Diretor diretor;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public String getQuantidadeFilmes() {
		return quantidadeFilmes;
	}
	public void setQuantidadeFilmes(String quantidadeFilmes) {
		this.quantidadeFilmes = quantidadeFilmes;
	}

}
