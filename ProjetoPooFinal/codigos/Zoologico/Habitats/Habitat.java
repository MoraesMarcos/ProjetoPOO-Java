package Zoologico.Habitats;

import java.util.List;

import Zoologico.Animais.Animal;

public class Habitat {

	private List<Animal> animal;


	public Habitat(List<Animal> animal) {
		super();
		this.animal = animal;
	}


	public List<Animal> getAnimal() {
		return animal;
	}


	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}


	public Habitat() {
		// TODO Auto-generated constructor stub
	}

}
