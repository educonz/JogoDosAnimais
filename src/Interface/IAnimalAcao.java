package Interface;

import java.util.ArrayList;

import Animal.Animal;

public interface IAnimalAcao {
	void Add(Animal animal);
	ArrayList<Animal> GetAnimais();
	String AnimalComparacao();
}
