package Animal;

import Interface.IAnimalAcao;

public class AnimalNaoViveNaAgua extends AnimalPadrao implements IAnimalAcao {
	
	public String AnimalComparacao() {
		return "Macaco";
	}
}
