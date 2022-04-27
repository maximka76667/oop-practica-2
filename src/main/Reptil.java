package main;

import java.time.LocalDateTime;

public class Reptil extends Animal {
	private EspecieReptil especie;
	private boolean venenoso;

	public Reptil(String nombre, LocalDateTime fechaNacimiento, double peso, EspecieReptil especie, boolean venenoso) {
		super.nombre = nombre;
		super.fechaNacimiento = fechaNacimiento;
		super.peso = peso;
		this.especie = especie;
		this.venenoso = venenoso;
	}

	public EspecieReptil getEspecie() {
		return especie;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	@Override
	public String toString() {
		return "Ficha de Perro\n" + "Nombre: " + this.nombre + "\n" + "Especie: " + this.especie + "\n"
				+ "Fecha de Nacimiento: " + this.fechaNacimiento + "\n" + "Peso: " + this.peso + " kg\n" + "Venenoso: "
				+ this.venenoso + "\n" + "Comentarios: " + this.comentarios;
	}
}
