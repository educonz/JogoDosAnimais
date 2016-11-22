package Animais;

import Classe.Acao;
import Interface.IInteragir;

public class Habilidade extends Acao {

	public Acao respostaSim;
	public Acao respostaNao;
	
	public Habilidade(Acao respostaSim, Acao respostaNao, String habilidade, IInteragir interagir) {
		super(habilidade, interagir);
		
		this.respostaSim = respostaSim;
		this.respostaNao = respostaNao;
	}

	@Override
	public Acao Executar(Acao acao) {
		if (MostraPergunta("O animal que você pensou ", getDescricao())) {
            this.respostaSim = this.respostaSim.Executar(null);
		}
        else {
            this.respostaNao = this.respostaNao.Executar(null);
        }
        return this;
	}
}
