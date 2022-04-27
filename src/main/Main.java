package main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ClinicaVeterinaria clinica = new ClinicaVeterinaria();

	public static void main(String[] args) {

//		Perro perro = new Perro("Max", LocalDateTime.now(), 20.3, RazaPerro.Husky, "HA123");
//
//		Gato gato = new Gato("Leo", LocalDateTime.now(), 4.1, RazaGato.Persa, "NBC32");
//
//		Pajaro pajaro = new Pajaro("Jack", LocalDateTime.now(), 0.035, EspeciePajaro.Periquito, false);
//
//		Reptil reptil = new Reptil("Michelangelo", LocalDateTime.now(), 60.6, EspecieReptil.Tortuga, false);
//
//		clinica.insertaAnimal(perro);
//		clinica.insertaAnimal(gato);
//		clinica.insertaAnimal(pajaro);
//		clinica.insertaAnimal(reptil);
//
//		System.out.println(clinica.buscaAnimal("Jack"));
//		
//		System.out.println();
//		
//		try {
//			clinica.modificaComentarioAnimal("Michelangelo", "Yahoo!!");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println(clinica.buscaAnimal("Michelangelo"));
//		
//		System.out.println();
//		
//		System.out.println(clinica);
		int opcionMenu = 0;

		while (opcionMenu != -1) {
			System.out.println("Clinica Veterinaria");
			System.out.println("Seleciona tu opción: ");
			System.out.println("1. Insertar animal");
			System.out.println("2. Buscar animal");
			System.out.println("3. Modificar el comentario del animal");
			System.out.println("4. Mostrar todos los animales");

			opcionMenu = entrada.nextInt();
			entrada.nextLine();

			switch (opcionMenu) {
			case 1:
				insertarAnimal();
				break;

			case 2:
				buscarAnimal();
				break;

			case 3:
				modificarComentario();
				break;

			case 4:
				mostrarClinica();
				break;

			default:
				break;
			}
		}

	}

	private static void modificarComentario() {
		System.out.println("Nombre del animal para modificar: ");
		String nombre = entrada.nextLine();

		if (clinica.buscaAnimal(nombre) != null) {
			System.out.println("Comentarios: ");
			String comentarios = entrada.nextLine();

			try {
				clinica.modificaComentarioAnimal(nombre, comentarios);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Animal no existe");
		}
	}

	private static void buscarAnimal() {
		System.out.println("Nombre del animal para buscar: ");
		String nombre = entrada.nextLine();
		System.out.println(clinica.buscaAnimal(nombre));

	}

	public static void insertarAnimal() {
		Animal nuevoAnimal = null;

		System.out.println("Tipo del animal (Perro - p, Gato - g, Pajaro - j, Reptil - r): ");
		char opcion = entrada.nextLine().charAt(0);

		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("Fecha Nacimiento (formato: aaaa-mm-ddThh:mm:ss): ");
		LocalDateTime fechaNacimiento = LocalDateTime.parse(entrada.nextLine());

		System.out.println("Peso");
		double peso = entrada.nextDouble();

		switch (opcion) {
		case 'p':
			System.out.println("Raza (PastorAleman - 0, Husky - 1, FoxTerrier - 2, Dalmata - 3, SanBernardo - 4): ");
			RazaPerro razaPerro = RazaPerro.values()[entrada.nextInt()];
			entrada.nextLine();

			System.out.println("Microchip: ");
			String microchipPerro = entrada.nextLine();

			nuevoAnimal = new Perro(nombre, fechaNacimiento, peso, razaPerro, microchipPerro);
			break;

		case 'g':
			System.out.println("Raza (Comun - 0, Siames - 1, Persa - 2, Angora - 3, ScottishFold - 4): ");
			RazaGato razaGato = RazaGato.values()[entrada.nextInt()];
			entrada.nextLine();

			System.out.println("Microchip: ");
			String microchipGato = entrada.nextLine();

			nuevoAnimal = new Gato(nombre, fechaNacimiento, peso, razaGato, microchipGato);
			break;

		case 'j':
			System.out.println("Especie (Canario - 0, Periquito - 1, Agapornis - 2): ");
			EspeciePajaro especiePajaro = EspeciePajaro.values()[entrada.nextInt()];
			entrada.nextLine();

			System.out.println("Cantor (Y/N): ");
			boolean cantor = entrada.nextLine().charAt(0) == 'Y' ? true : false;

			nuevoAnimal = new Pajaro(nombre, fechaNacimiento, peso, especiePajaro, cantor);
			break;

		case 'r':
			System.out.println("Especie (Tortuga - 0, Iguana - 1, DragonDeComodo - 2): ");
			EspecieReptil especieReptil = EspecieReptil.values()[entrada.nextInt()];
			entrada.nextLine();

			System.out.println("Cantor (Y/N): ");
			boolean venenoso = entrada.nextLine().charAt(0) == 'Y' ? true : false;

			nuevoAnimal = new Reptil(nombre, fechaNacimiento, peso, especieReptil, venenoso);
			break;

		default:
			break;
		}

		clinica.insertaAnimal(nuevoAnimal);
	}

	public static void mostrarClinica() {
		System.out.println(clinica);
	}

}
