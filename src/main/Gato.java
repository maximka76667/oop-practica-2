package main;

import java.time.LocalDateTime;

public class Gato extends Animal {

	private RazaGato raza;
	private String microchip;

	public Gato(String nombre, LocalDateTime fechaNacimiento, double peso, RazaGato raza, String microchip) {
		super.nombre = nombre;
		super.fechaNacimiento = fechaNacimiento;
		super.peso = peso;
		this.raza = raza;
		this.microchip = microchip;
	}

	public RazaGato getRaza() {
		return raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	@Override
	public String toString() {
		return "Ficha de Gato\n" + "Nombre: " + this.nombre + "\n" + "Raza: " + this.raza + "\n"
				+ "Fecha de Nacimiento: " + this.fechaNacimiento + "\n" + "Peso: " + this.peso + " kg\n" + "Microchip: "
				+ this.microchip + "\n" + "Comentarios: " + this.comentarios;
	}
}
