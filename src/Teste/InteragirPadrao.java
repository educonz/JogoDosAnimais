package Teste;

import Interface.IInteragir;

public abstract class InteragirPadrao implements IInteragir {
	private String animal;
	private String habilidade;
	
	public void SetAnimal(String animal)
	{
		this.animal = animal;
	}
	
	public void SetHabilidade(String habilidade)
	{
		this.habilidade = habilidade;
	}

	public abstract boolean Pergunta(String pergunta);

	public void MostrarVitoria() {
	}

	public String AprenderAnimal(String pergunta) {
		return this.animal;
	}

	public String AprenderHabilidade(String pergunta) {
		return this.habilidade;
	}
}
