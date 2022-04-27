package main;

import java.util.ArrayList;

public class ClinicaVeterinaria {

	private ArrayList<Animal> animals;

	public ClinicaVeterinaria() {
		animals = new ArrayList<Animal>();
	}

//	InsertaAnimal al que le pasamos un Animal y lo añade a la lista.

	public void insertaAnimal(Animal animal) {
		animals.add(animal);
	}

//	BuscaAnimal al que le pasamos el nombre del bicho y nos devuelve el
//	Animal en cuestión.

	public Animal buscaAnimal(String nombre) {
		for (Animal animal : animals) {
			if (nombre.equals(animal.getNombre())) {
				return animal;
			}
		}
		return null;
	}

//	ModificaComentarioAnimal al que le pasamos el nombre del animal y
//	el nuevo comentario y nos modifica el comentario en la ficha del animal
//	que está en la lista.

	public Animal modificaComentarioAnimal(String nombre, String comentarios) throws Exception {
		Animal animalParaModificar = buscaAnimal(nombre);

		if (animalParaModificar == null) {
			throw new Exception("Animal no existe");
		}

		animalParaModificar.setComentarios(comentarios);

		return animalParaModificar;
	}

//	ToString() sobreescrito, como siempre, que nos muestra la lista de
//	todas las fichas de los animales

	public String toString() {
		String resultado = "";
		for (int i = 0; i < animals.size(); i++) {
			resultado += "Animal " + (i + 1) + "\n" + animals.get(i).toString() + "\n\n";
		}
		return resultado;
	}

}
