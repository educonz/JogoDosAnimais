package Animal;

import java.util.ArrayList;

import Interface.IAnimalAcao;

public abstract class AnimalPadrao implements IAnimalAcao {
	
	private ArrayList<Animal> animais = new ArrayList<Animal>();

	public void Add(Animal animal) {
		this.animais.add(animal);
	}

	public ArrayList<Animal> GetAnimais() {
		return this.animais;
	}
	
	public abstract String AnimalComparacao();
}
