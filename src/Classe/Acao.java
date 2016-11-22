package Classe;

import Interface.IInteragir;

public abstract class Acao {
	
	private String descricao;
	private IInteragir interagir;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public IInteragir getInteragir() {
		return interagir;
	}
	public void setInteragir(IInteragir interagir) {
		this.interagir = interagir;
	}
	
	public Acao(String descricao, IInteragir interagir)
	{
		this.descricao = descricao;
		this.interagir = interagir;
	}
	
	public abstract Acao Executar(Acao acao);
	
	public boolean MostraPergunta(String pergunta, String habilidade)
	{
		return interagir.Pergunta(pergunta + habilidade);
	}
}
