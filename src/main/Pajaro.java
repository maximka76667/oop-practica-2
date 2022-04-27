package main;

import java.time.LocalDateTime;

public class Pajaro extends Animal {
	private EspeciePajaro especie;
	private boolean cantor;

	public Pajaro(String nombre, LocalDateTime fechaNacimiento, double peso, EspeciePajaro especie, boolean cantor) {
		super.nombre = nombre;
		super.fechaNacimiento = fechaNacimiento;
		super.peso = peso;
		this.especie = especie;
		this.cantor = cantor;
	}

	public EspeciePajaro getEspecie() {
		return especie;
	}

	public boolean getCantor() {
		return cantor;
	}

	@Override
	public String toString() {
		return "Ficha de Perro\n" + "Nombre: " + this.nombre + "\n" + "Especie: " + this.especie + "\n"
				+ "Fecha de Nacimiento: " + this.fechaNacimiento + "\n" + "Peso: " + this.peso + " kg\n" + "Cantor: "
				+ this.cantor + "\n" + "Comentarios: " + this.comentarios;
	}
}
