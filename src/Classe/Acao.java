package Classe;

import Animal.Animal;
import Interface.IAnimalAcao;
import Interface.IInteragir;

public class Acao {
	
	public boolean ProcurarAnimais(IAnimalAcao animalAcao, IInteragir interacao)
	{
		for (Animal animal : animalAcao.GetAnimais()) {
			if (interacao.Pergunta("O animal que você pensou " + animal.getHabilidade() + "?") && interacao.Pergunta("O animal que você pensou é " + animal.getNome() + "?"))
			{
				ExibirVitoria(interacao);
				return true;
			}
		}
		
		if (ProcurarAnimalPadrao(animalAcao, interacao)) {
			return true;
		}
		
		animalAcao.Add(interacao.Aprender(animalAcao.AnimalComparacao()));
		return false;
	}
	
	public boolean ProcurarAnimalPadrao(IAnimalAcao animalAcao, IInteragir interacao)
	{
		if (interacao.Pergunta("O animal que você pensou é " + animalAcao.AnimalComparacao() + "?")) {
			ExibirVitoria(interacao);
			return true;
		}
		
		return false;
	}
	
	private void ExibirVitoria(IInteragir interacao)
	{
		interacao.MostrarVitoria();
	}
}
