package main;

import java.time.LocalDateTime;

public abstract class Animal {

	protected String nombre, comentarios;
	protected LocalDateTime fechaNacimiento;
	protected double peso;

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public abstract String toString();
}
