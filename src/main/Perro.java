package main;

import java.time.LocalDateTime;

public class Perro extends Animal {

	private RazaPerro raza;
	private String microchip;

	public Perro(String nombre, LocalDateTime fechaNacimiento, double peso, RazaPerro raza, String microchip) {
		super.nombre = nombre;
		super.fechaNacimiento = fechaNacimiento;
		super.peso = peso;
		this.raza = raza;
		this.microchip = microchip;
	}

	public RazaPerro getRaza() {
		return raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	@Override
	public String toString() {
		return "Ficha de Perro\n" + "Nombre: " + this.nombre + "\n" + "Raza: " + this.raza + "\n"
				+ "Fecha de Nacimiento: " + this.fechaNacimiento + "\n" + "Peso: " + this.peso + " kg\n" + "Microchip: "
				+ this.microchip + "\n" + "Comentarios: " + this.comentarios;
	}

}
